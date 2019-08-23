use sakila;

#select [column_1 | expression] as
#'descriptive_name' from table_name;

select concat_ws(', ',last_name, first_name)
as 'full name'
from actor;

# cant use these in the where clause

