drop database festival_db;
create database festival_db;


create table festival_db.events (
	Id int not null primary key auto_increment,
    name varchar(45) not null,
    type varchar(45) not null,
    date date not null,
    id_places int 
);

create table festival_db.places(
	Id int not null primary key auto_increment,
    count_dancefloor int,
    count_all int not null
);

create table festival_db.members (
	Id int not null primary key auto_increment,
    name varchar(45) not null,
    type varchar(45) not null
);

create table festival_db.members_on_events (
    id_member int not null,
    id_event int not null,
    primary key(id_member,id_event)
);

create table festival_db.contacts(
	Id int not null primary key auto_increment,
    firstname varchar(45) not null,
	lastname varchar(45) not null,
    phone_num varchar(45) not null,
    email varchar(45) not null,
    id_member int,
    id_subscriber int

    
);

create table festival_db.subscribers(
	Id int not null primary key auto_increment,
    login varchar(45) not null,
    id_password int not null
);

create table festival_db.subscribers_on_events(
	
    id_subscriber int not null,
    id_event int not null,
    primary key(id_subscriber,id_event)
);

create table festival_db.passwords(
	Id int not null primary key auto_increment,
    hash varchar(300) not null,
    salt varchar(300) not null
);