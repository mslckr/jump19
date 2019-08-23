#grant revoke example

#create a user
create user 'testuser' identified by '123';

# drop user 'testuser';

#grant all on *.* to 'testuser';

#revoke all on *.* from 'testuser';

#grant all on sakila.* to 'testuser';

#revoke all on sakila.city from 'testuser';

#show grants of a user...



#commit rollback example

#use testdb;

#set session so no autocommits completed
#set session autocommit = 0;
#create table pet(pet_id int, pet_type varchar(100));

#commit;

#insert into pet values(1, 'dog');

#select * from pet;

#rollback;

#select * from pet;

#commit;



#savepoint example

#make sule autocommits off by this point

#savepoint before_insert;
#insert into pet values(1, 'dog');

#select * from pet; # 1 records displayed
#savepoint before_delete;
#delete from pet where pet_id = 1;

#select * from pet; # 0 records displayed

#savepoint before_update;
#rollback to before_delete;

#update pet set pet_type = 'fish' where pet_id = 1;

#select * from pet;

#rollback to before_insert;
#select * from pet;

#rollback;