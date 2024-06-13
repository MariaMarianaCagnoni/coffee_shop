-- Inserindo dados na tabela address
INSERT INTO address (city, street, house_number, zip_code)
VALUES ('São Paulo', 'Av. Paulista', '1000', '01310-100'),
       ('Rio de Janeiro', 'Rua das Laranjeiras', '200', '22240-003'),
       ('Curitiba', 'Av. Batel', '300', '80420-090');

-- Inserindo dados na tabela client
INSERT INTO client (id, name, cpf, email, phone, address_id)
VALUES (1, 'Maria Silva', '123.456.789-00', 'maria.silva@example.com', '(11) 91234-5678', 1),
       (2, 'João Souza', '987.654.321-00', 'joao.souza@example.com', '(21) 98765-4321', 2);

-- Inserindo dados na tabela employee
INSERT INTO employee (name, cpf, salary, bank_account, phone, address_id)
VALUES ('Carlos Santos', '321.654.987-00', 3500.00, '123456-7', '(41) 99876-5432', 3),
       ('Ana Pereira', '654.321.987-00', 4000.00, '765432-1', '(11) 97654-3210', 1);

-- Inserindo dados na tabela orders
INSERT INTO orders (order_status, client_id)
VALUES ('PENDING', 1),
       ('DELIVERED', 2);

-- Inserindo dados na tabela product
INSERT INTO product (id, name, description, image, expiration_date, quantity, price, order_id)
VALUES (1, 'Café Expresso', 'Café forte e encorpado', 'image1.jpg', '2024-12-31', 100, 5.00, 1),
       (2, 'Café com Leite', 'Café suave com leite', 'image2.jpg', '2024-12-31', 50, 6.00, 2);

-- Inserindo dados na tabela users
INSERT INTO users (user_name, password)
VALUES ('admin', 'admin123'),
       ('user', 'user123');
