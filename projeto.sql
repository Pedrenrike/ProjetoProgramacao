create database projeto;
use projeto;

create table usuario(
id			integer not null primary key auto_increment,
login		varchar(30) not null,
senha		varchar(30) not null,
cpf			varchar(20),
idade		integer not null,
telefone	varchar(20),
cidade		varchar(30),
atendente 	boolean
);

create table atendente(
salario		double(9,2),
id			integer primary key auto_increment,
nota		double(1,1),
avaliadores	integer
);

select * from usuario;

create table produto(
id          integer not null primary key,
nome		varchar(30) not null,
cnpj		varchar(30),
telefone	varchar(20),
nomeF		varchar(30)	not null
);

drop database projeto;

select * from produto;
