use sakila;
select * from actor;

select first_name
from actor
order by first_name asc;

select distinct first_name
from actor
order by first_name asc;

select distinct first_name
from actor
where last_name = 's'
order by first_name asc;

select * from film;

select rating, count(*)
from film
group by rating;
