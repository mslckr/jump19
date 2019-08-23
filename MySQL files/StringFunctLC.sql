use sakila;

select ascii('A') from dual;

select concat('life',' ', 'is', ' ', 'beautiful')
from dual;

select * ,concat(first_name,' ',last_name) as 'full_name'
from actor;

select * ,length(first_name) as 'first_name_letters'
from actor;

select upper('Aa') from dual;

select lower('Aa') from dual;

select substr("Beautiful",4,4);