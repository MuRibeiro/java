CREATE DATABASE db_registroescola;

USE db_registroescola;

CREATE TABLE tb_estudantes(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    nota DECIMAL(4,2),
    matricula VARCHAR(100),
    turma VARCHAR(10),
    periodo VARCHAR(10),
    transporte BOOLEAN
);

INSERT INTO tb_estudantes(nome, nota, matricula, turma, periodo, transporte) VALUES
("Jonas", 10.00, "40028922", "Brothers", "Integral", TRUE),
("Wallace", 6.30, "4874430", "Bondinho", "Noturno", TRUE),
("Joe", 10.00, "4896513", "Brothers", "Integral", TRUE),
("Geci", 10.00, "4951365", "Bondinho", "Noturno", TRUE),
("Cléubio", 5.30, "4789512", "Brothers", "Noturno", TRUE),
("Nique", 6.50, "4956213", "Bondinho", "Noturno", TRUE),
("Quelvin", 4.80, "4568794", "Brothers", "Integral", TRUE);

SELECT * FROM tb_estudantes;

SELECT * FROM tb_estudantes WHERE nota > 7;

SELECT * FROM tb_estudantes WHERE nota < 7;

UPDATE tb_estudantes 
SET nota = 9.00, matricula = 4002892
WHERE id = 8;