--Full Query Example
select count("EmployeeId"), "City","Country"
from "Employee"
group by "Country","City"
having count("EmployeeId")>1
order by "City" desc;

--Scalar functions
select length("Title") from "Album";

select upper("LastName") from "Customer";
--Aggregate functions
select count("AlbumId") from "Album";

select avg("UnitPrice") from "Track";

--Nested Queries- Select in a select
select * from "Album" where "AlbumId" in
(select "AlbumId" from "Track" where "Composer" ='AC/DC');

/*Joins!
*/
create table student (
s_id integer,
s_name varchar(20),
sch_id integer
);

 
create table school(
sch_id integer,
sch_name varchar(20)
);
INSERT INTO SCHOOL VALUES(1,'USF');
INSERT INTO SCHOOL VALUES(2,'FSU');
INSERT INTO SCHOOL VALUES(3,'UA');
INSERT INTO SCHOOL VALUES(4,'UGA');
INSERT INTO SCHOOL VALUES(5,'LSU');
INSERT INTO SCHOOL VALUES(6,'AU');

INSERT INTO STUDENT VALUES(1, 'Matt',3);
INSERT INTO STUDENT VALUES(2, 'Trevor',5);
INSERT INTO STUDENT VALUES(3, 'Gavin',1);
INSERT INTO STUDENT VALUES(4, 'Kirby',5);
INSERT INTO STUDENT VALUES(5, 'Bobby',4);
INSERT INTO STUDENT VALUES(6, 'Joe',2);
INSERT INTO STUDENT VALUES(7, 'Leslie',1);
INSERT INTO STUDENT VALUES(8, 'Roger Moore',3);
INSERT INTO STUDENT VALUES(9, 'Brad',2);
INSERT INTO STUDENT VALUES(10, 'Darth Vader',5);

--Inner
select * from student inner join school
on student.sch_id=school.sch_id;

--Right Join
select * from school right join student
on school.sch_id=student.sch_id;
--Left
select * from school left join student
on school.sch_id=student.sch_id;
--Outer Join - no "outer" keyword
select * from student full join school
on student.sch_id=school.sch_id;

--Self Join
create table student2(
id integer,
name varchar(20),
lab_partner integer
);

INSERT INTO STUDENT2 VALUES(1, 'MATT',6);
INSERT INTO STUDENT2 VALUES(2, 'BEN',5);
INSERT INTO STUDENT2 VALUES(3, 'REN',4);
INSERT INTO STUDENT2 VALUES(4, 'HANN',3);
INSERT INTO STUDENT2 VALUES(5, 'KEN',2);
INSERT INTO STUDENT2 VALUES(6, 'LEVI',1);

select a.name as student, b.name as lab_partner
from student2 a join student2 b
on a.lab_partner =b.id;
--Set operations
--Union ALL and Union
select "FirstName", "LastName" from "Employee" -- <--notice no ; here!!
union all
select "FirstName", "LastName" from "Customer";

select "FirstName", "LastName" from "Employee"
union 
select "LastName", "FirstName" from "Customer"; -- Same # of columns! takes column name from 1st query

--Intersect and Intersect ALL
select "City" from "Employee"
intersect
select "City" from "Customer";

select "Country" from "Employee"
intersect all
select "Country" from "Customer";
--Except and Except ALL
select "name" from "student2"
except
select "s_name" from "student";

--Sequence
create sequence mySeq
increment by -13
start with 1337
minvalue 975
maxvalue 4000;

select setval('mySeq',1977);
select nextval('mySeq'); 

insert into student values(nextval('mySeq'),'Morgen',1),(nextval('mySeq'),'Kimi',5);
select * from student;

--view
create view my_view
 as 
 select "Artist"."Name", "Album"."Title"
 from "Album" inner join "Artist"
 on "Album"."ArtistId"= "Artist"."ArtistId";
 
select * from my_view; 

select * from my_view
where "Name" like 'T%' or "Name" like 'B%';

create view gaby
as
select * from my_view
where "Name" like 'T%' or "Name" like 'B%';

select * from gaby;


--Triggers
create trigger school_insert
before insert on "school"
for each row;

