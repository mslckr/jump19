use sakila;

select * from address;

select address.address_id, customer.first_name
from address
inner join customer
on address.address_id = customer.address_id;

select address.address_id, customer.first_name
from address
left join customer
on address.address_id = customer.address_id
order by address_id asc;

select address.address_id, customer.first_name
from address
right join customer
on address.address_id = customer.address_id
order by address_id asc;

select address.address_id, customer.first_name
from address
left join customer
on address.address_id = customer.address_id
union all
select address.address_id, customer.first_name
from address
right join customer
on address.address_id = customer.address_id;
