CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos(
	Id BIGINT AUTO_INCREMENT PRIMARY KEY,
    EAN BIGINT,
    Nome VARCHAR(100),
    Altura DECIMAL(5,2),
    Largura DECIMAL(5,2),
    Valor DECIMAL(8,2)
);

SELECT * FROM tb_produtos;

INSERT INTO tb_produtos(EAN, Nome, Altura, Largura, Valor) VALUES
(12345, "Cadeira", 80.00, 50.00, 200.00),
(12346, "Estante", 90.00, 100.00, 800.00),
(12347, "Mesa", 100.00, 100.00, 1200.00),
(12348, "Poltrona", 80.00, 60.00, 1500.00),
(12349, "Mesa Centro", 50.00, 50.00, 950.00);

DROP TABLE tb_produtos;

SELECT * FROM tb_produtos WHERE Valor > 500;

SELECT * FROM tb_produtos WHERE Valor < 500;

UPDATE tb_produtos 
SET Valor = 450
WHERE Id = 2;