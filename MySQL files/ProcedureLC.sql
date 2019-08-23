#ignore, instead leftclick views
create definer ='root'@'localhost' procedure 'getAll_Actors'()
begin
select * from actor
end
