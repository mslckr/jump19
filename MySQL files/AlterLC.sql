create database pokedex;

use pokedex;
create table Pokemon (
	pokemon_id varchar(15) not null primary key,
    pokemon_name varchar(50),
    no_evolutions int
    );
alter table Pokemon
Add Gender varchar(2);

alter table Pokemon
modify Gender int;

alter table Pokemon
drop Gender;
