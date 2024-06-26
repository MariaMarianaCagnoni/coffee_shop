-- Criando a tabela address
CREATE TABLE address
(
    id           BIGINT AUTO_INCREMENT PRIMARY KEY,
    city         VARCHAR(255) NOT NULL,
    street       VARCHAR(255) NOT NULL,
    house_number VARCHAR(255) NOT NULL,
    zip_code     VARCHAR(255) NOT NULL
);

-- Criando a tabela client
CREATE TABLE client
(
    id         BIGINT PRIMARY KEY,
    name       VARCHAR(255) NOT NULL,
    cpf        VARCHAR(255) UNIQUE,
    email      VARCHAR(255) UNIQUE,
    phone      VARCHAR(255) NOT NULL,
    address_id BIGINT       NOT NULL,
    CONSTRAINT fk_address_client FOREIGN KEY (address_id) REFERENCES address (id)
);

-- Criando a tabela employee
CREATE TABLE employee
(
    id           BIGINT AUTO_INCREMENT PRIMARY KEY,
    name         VARCHAR(255)   NOT NULL,
    cpf          VARCHAR(255)   NOT NULL UNIQUE,
    salary       DECIMAL(10, 2) NOT NULL,
    bank_account VARCHAR(255)   NOT NULL,
    phone        VARCHAR(255)   NOT NULL,
    address_id   BIGINT         NOT NULL,
    CONSTRAINT fk_address_employee FOREIGN KEY (address_id) REFERENCES address (id)
);

-- Criando a tabela orders
CREATE TABLE orders
(
    id           BIGINT AUTO_INCREMENT PRIMARY KEY,
    order_status VARCHAR(255),
    client_id    BIGINT,
    CONSTRAINT fk_client_order FOREIGN KEY (client_id) REFERENCES client (id)
);

-- Criando a tabela product
CREATE TABLE product
(
    id              BIGINT PRIMARY KEY,
    name            VARCHAR(255)   NOT NULL,
    description     VARCHAR(255)   NOT NULL,
    image           VARCHAR(255),
    expiration_date DATE           NOT NULL,
    quantity        INT            NOT NULL,
    price           DECIMAL(10, 2) NOT NULL,
    order_id        BIGINT,
    CONSTRAINT fk_order FOREIGN KEY (order_id) REFERENCES orders (id)
);


-- Criando a tabela users
CREATE TABLE users
(
    id        BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(255) UNIQUE,
    password  VARCHAR(255)
);
