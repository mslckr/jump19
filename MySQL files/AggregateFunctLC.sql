use sakila;

select sum(amount)
from payment;

select avg(amount)
from payment;

select max(amount)
from payment;

select min(amount)
from payment where amount > 5;

select count(address)
from address;
