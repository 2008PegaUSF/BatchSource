--Cursors -Result Set saved to a variable
--Lots of clauses, lots of potential
BEGIN;
DECLARE test_cur CURSOR WITH HOLD FOR SELECT * FROM "Employee" ORDER BY "EmployeeId";
COMMIT;


fetch 1 from test_cur;-- gets first row (notice id)
fetch 4 from test_cur;-- gets the NEXT 4 rows (id started at 2)
fetch 2 from test_cur; --when there are no more rows, you dont get anything!
--Functions
/*out parameter define coulumn names and types
 * in parameters are used by function can can be referenced by $[index number]
 * $$ acts as a delimiter to separate logic
 * LANGUAGE specifys logic language
 */

CREATE or replace FUNCTION dup(out f1 int, out f2 text,in int)
    AS  $$ 
    SELECT $1, CAST($1 AS text) || ' is text' $$
    LANGUAGE SQL;

SELECT * FROM dup(93);

CREATE or replace FUNCTION dup2(out f1 text, out f2 int,in int, in text)
    AS $$ 
    SELECT $2,$1;$$
    LANGUAGE SQL;
    
   SELECT * FROM dup2(42,'roll tide');
   
   CREATE or replace FUNCTION dup3(out f1 text, out f2 int,in int, in text)
    AS $$ 
    select $2 ||'woo', $1+1;$$
    LANGUAGE SQL;
   
   SELECT * FROM dup3(42,'roll tide');
   
  CREATE TYPE dup4_result AS (f1 text, f2 int);
  
     CREATE or replace FUNCTION dup4(in int, in text)
    returns dup4_result 
   AS $$ 
    select $2 ||'woo', $1+1;$$
    LANGUAGE SQL;
   
    SELECT * FROM dup4(42,'roll tide');
    
   create or replace function employeeCount()
   returns integer as $$
   declare
   				total integer;
begin
	select count("EmployeeId") into total from "Employee";
		return total;
end;
$$ language plpgsql;

select employeeCount();

select * from dup(employeeCount());

SELECT * FROM dup3(employeeCount(),' roll tide');

--Triggers
create sequence emp_id_seq
start 9;

create or replace function emp_insert()
returns trigger as $$
begin
	if(TG_OP = 'INSERT') then
	new."EmployeeId" = (select nextval('emp_id_seq'));
	end if;
	return new;
end;
$$ language plpgsql;
--Before trigger
create trigger employee_insert
before insert on "Employee"
for each row
execute function emp_insert();

insert into "Employee"("EmployeeId","FirstName","LastName")
values(-43,'matt','k');

delete from "Employee" where "LastName" = 'k';

insert into "Employee"("FirstName","LastName")
values('matt','k');
--After Trigger
create sequence cus_id_seq
start 65;

create or replace function cus_insert()
returns trigger as $$
begin
	if(TG_OP = 'INSERT') then
	new."LastName" = 'Smith';
	end if; 
	return new;
end;
$$ language plpgsql;

create trigger customer_insert
after insert on "Customer"
for each row
execute function cus_insert();

insert into "Customer" ("CustomerId","FirstName" ,"LastName","Email")
values (88,'Jim','bob','a@a');

insert into "Customer" ("CustomerId" , "FirstName" ,"LastName" , "Email" )
values (92,'tim','bob','a@s');

insert into "Customer" ("CustomerId" , "FirstName" , "LastName" , "Email" )
values (87,'sam', 'bob', 'a@a');


insert into "Customer" ("CustomerId" ,"FirstName" , "LastName","Email" ) 
values(88,'jim','bob','a@a');

insert into "Customer" ("CustomerId","FirstName" , "LastName","Email" ) 
values(93,'tim','bob','a@a');

select now();