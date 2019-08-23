use testdb;

create table Blazer_Day(
id int(1) not null auto_increment primary key,
day char(10)
);

insert into Blazer_Day (day) values ('Sunday');
insert into Blazer_Day (day) values ('Monday');
insert into Blazer_Day (day) values ('Tuesday');
insert into Blazer_Day (day) values ('Wednesday');
insert into Blazer_Day (day) values ('Thursday');
insert into Blazer_Day (day) values ('Friday');
insert into Blazer_Day (day) values ('Saturday');

update Blazer_Day set day = 'Blazerday!' where id in ('2');
update Blazer_Day set day = 'Blazerday!' where id in ('5');

select * from Blazer_Day;