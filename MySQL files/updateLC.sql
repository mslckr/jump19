use sakila;

select * from film;

update film
set language_id = 2 where film_id = 1;

select * from film;