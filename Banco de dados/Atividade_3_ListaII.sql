CREATE DATABASE db_farmacia_bem_estar;

USE db_farmacia_bem_estar;

CREATE TABLE tb_categorias(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(100),
    etiqueta VARCHAR(100)
);

CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    marca VARCHAR(255),
    nome VARCHAR(255),
    quantidade BIGINT,
    valor DECIMAL (8,2),
    categoria_id BIGINT,
    
    FOREIGN KEY(categoria_id) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias(descricao, etiqueta) VALUES
("Medicamentos", "Cinza"),
("Alimentos", "Vermelho"),
("Perfumaria", "Verde"),
("Higiene Pessoal", "Azul"),
("Cuidado Bebês", "Laranja");

INSERT INTO tb_produtos(marca, nome, quantidade, valor, categoria_id) VALUES
("Carolina Herrera", "212 Men", 20, 220.00, 3),
("Pampers", "Fralda PP", 25, 32.00, 5),
("Medical", "Dipirona", 10, 9.00, 1),
("Nutry", "Barra Cereal", 15, 5.00, 2),
("Dove", "Sabonete", 35, 7.00, 4),
("Elma Chips", "Fandangos", 10, 4.00, 2),
("Listerine", "Enxaguante Bucal", 15, 15.00, 4),
("Natura", "Loção Mamãe&Bebê", 5, 55.00, 5);

SELECT * FROM tb_categorias;

SELECT * FROM tb_produtos WHERE valor > 50.00;

SELECT * FROM tb_produtos WHERE valor >= 5.00 AND valor <= 60.00;
SELECT * FROM tb_produtos WHERE valor BETWEEN 5.00 AND 60.00;

SELECT * FROM tb_produtos WHERE nome LIKE "%C%";

SELECT * FROM tb_produtos
INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categoria_id;

SELECT * FROM tb_produtos
INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categoria_id
WHERE tb_categorias.descricao = "medicamentos";
