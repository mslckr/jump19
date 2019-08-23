create database pokedex;

use pokedex;
create table pokemon (
	pokemon_id varchar(15) not null primary key,
    pokemon_name varchar(50),
    no_evolutions int
    );
describe pokemon;