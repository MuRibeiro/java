CREATE DATABASE db_rhCompany;

USE db_rhCompany;

CREATE TABLE tb_funcionarios(

	matricula BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(150),
    funcao VARCHAR(100),
    setor VARCHAR(100),
    salario DECIMAL(8,2)
    
);

INSERT INTO tb_funcionarios(nome, funcao, setor, salario)
VALUE ("Juliana", "Software Engineer", "MM Diretos", 9000.00); 

SELECT * FROM tb_funcionarios;

INSERT INTO tb_funcionarios(nome, funcao, setor, salario) VALUES
("Murilo", "Desenvolvedor Java Jr.", "NN Diretos", 6000.00),
("Murilo", "Desenvolvedor Java Jr.", "NN Diretos", 6000.00), 
("Davi", "Analista Jr.", "OO Diretos", 5000.00),
("Maria Julia", "Estagiao", "PP Diretos", 2000.00);

SELECT * FROM tb_funcionarios WHERE salario < 4000.00;

DELETE FROM tb_funcionarios WHERE matricula = 2;

INSERT INTO tb_funcionarios(nome, funcao, setor, salario) VALUE
("Theo", "Jovem Aprendiz", "QQ Diretos", 1300.00);

SELECT * FROM tb_funcionarios WHERE salario > 4000.00;

