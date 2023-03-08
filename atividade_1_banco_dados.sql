-- comando para criação do Banco de Dados --
CREATE DATABASE db_quitanda;

-- comando para indicar ao mysql usar o db_quitanda --
USE db_quitanda;

-- comando para criar tabela --
CREATE TABLE tb_produtos(
 -- escreve os dados dentro do () tb_produtos --

 -- AUTO_INCREMENT é a função para preencher esse dado automaticamente -- 
	id BIGINT AUTO_INCREMENT,

-- PRIMARY KEY define o dado que sera a chave primaria --	
    PRIMARY KEY(id),
    
-- VARCHAR() voce limita o tamanho do texto a ser inserido --
	nome_produto VARCHAR(255),

-- DECIMAL(6,2) limita a 6 numero e 2 numeros depois da virgula --
    preco_produto DECIMAL(6,2)
);

-- SELECT buscar -> * todos -> FROM tb_produtos define o lugar que é pra buscar dados
SELECT * FROM tb_produtos;

-- INSER INTO inserir dados na tb_produtos 
-- dentro dos() coloca os dados na ordem que sera inserido
INSERT INTO tb_produtos(nome_produto, preco_produto) 
-- VALUE comando para inserir o os dados desejado. Também escrito na ordem
	VALUE("Maçã", 3.00), ("Banana", 5.00), ("Mexirica", 7.00);

-- comando para deletar um dado na tabela SEMPRE USAR WHERE
DELETE FROM tb_produtos WHERE id = 2;
DELETE FROM tb_produtos WHERE id = 5;
DELETE FROM tb_produtos WHERE id = 6;
DELETE FROM tb_produtos WHERE id = 7;

-- desativa o modo seguro do mysql e permite update e delete
SET SQL_SAFE_UPDATES = 0;

-- atualização de um dado dentro da minha tabela SEMPRE USAR WHERE 
UPDATE tb_produtos SET preco_produto = 7.90 WHERE id = 4; 
