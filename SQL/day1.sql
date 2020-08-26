create table myfirsttable(
mycol int not null
);

create role chinook1 login password 'p4ssw0rd' noinherit createdb;

create database chinookdb;

grant connect on database chinookdb to chinook1;