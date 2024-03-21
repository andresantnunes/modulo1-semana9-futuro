-- Insert sample data into Livro table
INSERT INTO Livro (id, titulo, autor, anoPublicacao)
VALUES (1, 'Dom Quixote', 'Miguel de Cervantes', 1605),
       (2, 'A Arte da Guerra', 'Sun Tzu', 5th century BCE),
       (3, 'Orgulho e Preconceito', 'Jane Austen', 1813);

-- Insert sample data into Membros table
INSERT INTO Membros (id, nome, endereco, telefone)
VALUES (1, 'Alice', 'Rua A, 123', '+123456789'),
       (2, 'Bob', 'Rua B, 456', '+987654321');

-- Insert sample data into Empréstimos table
INSERT INTO Emprestimos (id, livro_id, membro_id, dataEmprestimo, dataDevolucao)
VALUES (1, 1, 1, '2024-02-24', '2024-03-10'),
       (2, 2, 2, '2024-02-25', '2024-03-15');

-- Insert sample data into Bibliotecario table
INSERT INTO Bibliotecario (id, nome, email, senha)
VALUES (1, 'Carol', 'carol@example.com', 'senha123'),
       (2, 'David', 'david@example.com', 'abc123');

-- Insert sample data into Visitante table
INSERT INTO Visitante (id, nome, telefone)
VALUES (1, 'Eva', '+111222333'),
       (2, 'Fernando', '+444555666');
