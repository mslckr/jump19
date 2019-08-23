select ceil(15.8);
select floor(15.8);

select pow(4,2);

select greatest(4,2,3,1);

use sakila;

select payment_id, amount, compareAmount, greatest(amount,compareAmount)
as greatestAmt from payment;