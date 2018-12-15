CREATE TABLE pessoa ( 
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome varchar(150) NOT NULL,
    logradouro varchar(255),
    numero varchar(10),
    complemento varchar(100),
    bairro varchar(50),
    cep varchar(9),
    cidade varchar(50),
    estado varchar(50),
    ativo bit
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 DEFAULT COLLATE utf8mb4_general_ci;

INSERT INTO pessoa (nome,logradouro,numero,complemento,bairro,cep,cidade,estado,ativo) values ('Carlos','Rua J','78','Mendara','Marambaia','66615-690','Belém','Pará','');
INSERT INTO pessoa (nome,logradouro,numero,complemento,bairro,cep,cidade,estado,ativo) values ('Laize','Rua J','78','Mendara','Marambaia','66615-690','Belém','Pará','');
INSERT INTO pessoa (nome,logradouro,numero,complemento,bairro,cep,cidade,estado,ativo) values ('Regina','Rua J','78','Mendara','Marambaia','66615-690','Belém','Pará','');
INSERT INTO pessoa (nome,logradouro,numero,complemento,bairro,cep,cidade,estado,ativo) values ('Alberto','Rua J','78','Mendara','Marambaia','66615-690','Belém','Pará','');
INSERT INTO pessoa (nome,logradouro,numero,complemento,bairro,cep,cidade,estado,ativo) values ('Nuno','Rua J','78','Mendara','Marambaia','66615-690','Belém','Pará','');
INSERT INTO pessoa (nome,logradouro,numero,complemento,bairro,cep,cidade,estado,ativo) values ('Vânia','Rua J','78','Mendara','Marambaia','66615-690','Belém','Pará','');