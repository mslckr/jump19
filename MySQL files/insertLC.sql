create database prison;
use prison;

create TABLE prisoner(id int, pname varchar(50), hashand bool);

insert into prisoner(id, pname, hashand) values(5,'bot',true);
insert into prisoner values(4, 'hook',false);

select * from prisoner;
