create table tb_produto (
	id bigint auto_increment not null primary key,
	nome varchar(255) not null,
	descricao varchar(300),
	preco numeric(18,2)
);