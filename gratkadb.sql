create database gratkadb;
use gratkadb;

create table students(
id_student int primary key auto_increment not null,
first_name varchar(15) not null,
last_name varchar(15) not null

);

drop table students;
insert into students values (1, 'Jan', 'Nowak');
insert into students values (2, 'Anna ', 'Kowalska');
insert into students values (3, 'Piotr', 'Kowalski');


