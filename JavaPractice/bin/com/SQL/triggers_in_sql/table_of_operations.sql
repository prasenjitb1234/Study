

create table users (

user_id int primary key,
name varchar(200),
per_hour_salary int default 0,
working_hour int default 0,
total_salary int default 0



);

desc users;

insert into users(user_id,name,per_hour_salary,working_hour) 
values( 1003,"Raj",3000,60 );

update users set working_hour = 10, per_hour_salary=10000 where user_id = 1001;

select * from users;













