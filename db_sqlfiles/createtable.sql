create database festival_db;

create table festival_db.event (
	Id int not null primary key auto_increment,
    name varchar(45) not null,
    type varchar(45) not null,
    date date not null,
    id_places int 
);