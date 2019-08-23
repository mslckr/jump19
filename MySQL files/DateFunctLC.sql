use testdb;

create table TimeTable(
DateAndTime datetime
);

insert into TimeTable(DateAndTime)
values(adddate('2018-12-04', 4));

insert into TimeTable(DateAndTime)
values(last_day('2018-12-04'));

insert into TimeTable(DateAndTime)
values(current_date());

#extract...<?>