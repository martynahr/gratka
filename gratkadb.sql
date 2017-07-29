create database gratkadb;
use gratkadb;

create table students(
id_student int primary key auto_increment not null,
first_name varchar(15) not null,
last_name varchar(15) not null
);


insert into students values (1, 'Jan', 'Nowak');
insert into students values (2, 'Anna ', 'Kowalska');
insert into students values (3, 'Piotr', 'Kowalski');

create table questions(
id_question int primary key auto_increment not null,
question_body text not null,
option_a text not null,
option_b text not null,
option_c text not null,
option_d text not null,
answear varchar(1) not null,
category varchar(3) not null
);

insert into questions values (1, 'Treść pytania 1', 'odpowiedz a', 'odpowiedz b', 'odpowiedz c','odpowiedz d', 'c', 'J');
insert into questions values (2, 'Treść pytania 2', 'odpowiedz a', 'odpowiedz b', 'odpowiedz c','odpowiedz d', 'c', 'P');

create table results(
id_result int primary key auto_increment not null,
student int not null,
result int not null,
foreign key(student) references students(id_student) 
);

insert into results values (1, 2, 80);
insert into results values (2, 2, 60);
insert into results values (3, 3, 55);




