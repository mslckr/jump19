select sakila;

create view customer_fullname as
select concat (customer.first_name,' ',customer.last_name);

select * from sakila.customer_fullname;

create view customer_fullname as 
select concat(customer.first_name,'		',customer.last_name)
from customer;

call getAll_Actors;