# Coffee Shop Campinas

Projeto que visa a criação de um site completo  de Coffee shop.

## Ferramentas
* [IntelliJ](https://www.jetbrains.com/idea/) - IDE para desenvolvimento.
* [Docker](https://www.docker.com/) - Container para subir o banco
* [Postgres](https://www.postgresql.org/) - Banco usado em produção
* [H2 database](https://www.h2database.com/html/main.html) - Banco usado em ambiente de desenvolvimento
* [Angular](https://angular.dev/) - Framework utilizado para construir o frontend

## Links importantes
* [Spring Boot Rest API](https://medium.com/better-programming/building-a-spring-boot-rest-api-a-php-developers-view-part-i-6add2e794646) -  API com Spring Boot.
* Para acessar o projeto em produção clique [aqui.]()
# < Coffee Shop Campinas>


### Requisitos Funcionais
Respeitando a proposta, o sistema deverá atender os seguintes requisitos:

* **RF1** - Funcionários poderão buscar clientes do sistema.
* **RF2** - Funcionários poderão cadastrar/alterar/deletar/buscar produtos do sistema.
* **RF3** - Clientes poderão criar/alterar/deletar seus pedidos
* **RF3** - Clientes poderão criar/alterar/deletar suas informações de cadastro.

## Regras de Negócio

_Pedido_

**RGN1** -  O cliente só fará o pedido se estiver cadastrado e logado.

_Mudança/cancelamento do pedido_

**RGN2** - O cliente poderá deletar ou alterar o pedido, contanto que esteja devidadamente logado no sistema com seu email e senha.


## DER

**DER** - *Visão geral das entidades e relacionamentos*



<a data-flickr-embed="true" href="https://www.flickr.com/photos/200770519@N03/53757582498/in/dateposted-public/" title="DER"><img src="https://live.staticflickr.com/65535/53757582498_27ab7091f4_w.jpg" width="400" height="191" alt="DER"/></a>
## Mapa dos Endpoints.


| Nome                        | Funcionalidade                         |
|-----------------------------|----------------------------------------|
| ```GET``` /products         | Informa todos os produtos registrados. |
| ```GET``` /clients          | Informa todos os clients registrados.  |
| ```GET``` /orders           | Informa todos os pedidos registrados.  |
| ```GET``` /orders/{id}      | Busca o pedido por id.                 |
| ```GET``` /clients/{id}     | Busca o cliente pelo id.               |
| ```GET``` /products/{id}    | Busca o produto pelo id.               |
| ```POST``` /clients         | Adiciona novo  cliente.                |
| ```POST``` /products        | Adiciona novo produto.                 |
| ```POST``` /orders          | Adiciona novo pedidos.                 |
| ```PUT``` /orders/{id}      | Atualiza o pedido por id.              |
| ```PUT``` /clients/{id}     | Atualiza o cliente pelo id.            |
| ```PUT``` /products/{id}    | Atualiza o produto.                    |
| ```DELETE``` /products/{id} | Deleta o produto por id.               |
| ```DELETE``` /clients/{id}  | Deleta o cliente pelo id.              |
| ```DELETE``` /orders/{id}   | Deleta o pedido pelo id.               |


