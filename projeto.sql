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

select * from usuario;

create table atendente(
salario		double(9,2),
id			integer not null primary key,
nota		double(1,1),
avaliadores	integer
);

select * from atendente;

select * from usuario;

create table produto(
id          integer not null primary key auto_increment,
nome		varchar(30) not null,
descricao	varchar(30),
quantidade 		integer,
valor		double(9,2),
comissao	double(9,2)
);

select * from produto;

create table servico(
id          integer not null primary key auto_increment,
nome		varchar(30) not null,
descricao	varchar(30),
valor		double(9,2)
);

select * from servico;
