create schema empresa;

CREATE TABLE empresa.Trabalhador (
    TrabalhadorID INT PRIMARY KEY,
    Nome VARCHAR(255),
    Cargo VARCHAR(100),
    Salario DECIMAL(10,2)
);

ALTER TABLE empresa.Trabalhador
ADD COLUMN Departamento VARCHAR(50);

DROP TABLE Trabalhador;

INSERT INTO empresa.Trabalhador (TrabalhadorID, Nome, Cargo, Salario, Departamento)
VALUES 
(1, 'João Silva', 'Desenvolvedor', 75000.00, 'TI'),
(2, 'Tiago Silva', 'Recrutador', 55000.00, 'RH'),
(3, 'Pedro Silva', 'Gerente', 175000.00, 'TI')
;

UPDATE empresa.Trabalhador
SET Salario = 80000.00
WHERE TrabalhadorID = 1;

DELETE FROM empresa.Trabalhador
WHERE TrabalhadorID = 1;



select * from empresa.Trabalhador;