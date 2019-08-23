use sakila;
show tables;
select * from actor;

select first_name, last_name from actor;

select * from sakila.actor where first_name = 'Penelope';

select * from actor where actor_id =1 and first_name = 'Penelope';

select actor_id*100+1,first_name,last_name from actor;

select 20+200, 35*3;

select * from actor, actor_info where actor.first_name = actor_info.first_name;