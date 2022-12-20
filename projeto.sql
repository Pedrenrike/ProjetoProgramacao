create database projeto;
use projeto;

create table usuario(
id			integer not null primary key,
login		varchar(30) not null,
senha		varchar(30) not null,
cpf			varchar(20),
idade		integer not null,
telefone	varchar(20),
cidade		varchar(30)
);

select * from usuario;