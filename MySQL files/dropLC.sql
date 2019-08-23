#create database newtest;

use newtest;

create table people(
person_name varchar(40),
age int(3)
);

insert into people(person_name, age) values ("Mr Tester", 21);

alter table people
drop age;

select * from people;

drop table people;