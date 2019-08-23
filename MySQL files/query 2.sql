create database test;

use test;

create table myTable(
	myNumber varchar(10) not null unique,
    myName varchar(50)
    );
    
insert into myTable(myNumber, myName)
values('9062442090', 'Matthew');

select * from myTable;

#constraints live coding 1