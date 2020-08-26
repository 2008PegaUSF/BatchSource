--Single comment
/*
 * Multi
 * Line
 * Comment
 * WOOOOO
 */ 
create table bear(
bear_id integer primary key,
bear_type_id integer,
bear_name varchar(100),
bear_birthdate date,
bear_weight integer default 200,
cave_id integer
);

create table bear_type(
bear_type_id integer primary key,
bear_type_name varchar(100)
);

create table cave(
cave_id integer primary key,
cave_name varchar(100),
max_bears integer default 4
);

create table beehive(
beehive_id integer primary key,
beehive_weight integer default 50
);

create table bear_beehive(
bear_id integer,
beehive_id integer,
primary key(bear_id,beehive_id)
);

--Add constraints

alter table bear 
add constraint fk_bear_cave
foreign key (cave_id) references cave(cave_id);

alter table bear
add constraint fk_bear_bear_type
foreign key (bear_type_id) references bear_type(bear_type_id);

alter table bear_beehive
add constraint fk_bear_beehive_bear
foreign key (bear_id) references bear(bear_id);

alter table bear_beehive
add constraint fk_bear_beehive_beehive
foreign key (beehive_id) references beehive(beehive_id);

--Check Constraints
alter table bear
add constraint ck_bear_weight_positive
check (bear_weight>0);

alter table beehive
add constraint ck_beehive_weight_positive
check (beehive_weight>0);

insert into bear_type values(1,'grizzly');
insert into cave values(1,'batcave',3);


insert into bear values(1,1, 'leslie','11-NOV-1952',350,1);

select * from bear;

