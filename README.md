# Coffee Shop Campinas
<fig>
<img src="https://rockcontent.com/br/wp-content/uploads/sites/2/elementor/thumbs/modelo-de-projeto-p2he6clp7uhmwqd16ikv9jgz30a5liixoon908hej0.png" alt="Uma imagem relacionada ao projeto">
<figcaption>Uma imagem relacionada ao projeto</figcaption>
</fig>

## Inicialização
Para executar o projeto, utilize as ferramentas descritas na sessão *Ferramentas*.

## Ferramentas
* [IntelliJ](https://www.jetbrains.com/idea/) - IDE para desenvolvimento.
* [Docker](https://www.docker.com/) - Container para subir o banco
* [Postgres](https://www.postgresql.org/) - Banco usado em produção
* [H2 database](https://www.h2database.com/html/main.html) - Banco usado em ambiente de desenvolvimento

## Links importantes
* [Spring Boot Rest API](https://medium.com/better-programming/building-a-spring-boot-rest-api-a-php-developers-view-part-i-6add2e794646) -  API com Spring Boot.
* Para acessar o projeto em produção clique [aqui.]()
# < Coffee Shop Campinas>

## Introdução

> É interessante colocar aqui uma visão bem geral, aquilo que você falaria em uma reunião rápida.  
> Vai ser a resposta que você da pra sua tia quando ela pergunta o que está fazendo da vida.

Este projeto possui o objetivo principal **< descreva o objetivo principal >**.  
Com os objetivos gerais de realizar a inserção de **< objeto >** e verificação de **< objeto >**.

## Análise técnica

### Descrição do ambiente técnico

O sistema é composto por um banco de dados, uma interface web e um sistema embarcado. Funcionalidades principais:
> Indique os grandes blocos do sistema.

* **F1** - Nome da funcionalidade 1.
* **F2** - Nome da funcionalidade 2.
* **F3** - Nome da funcionalidade 3.
> Coloque somente o nome principal, por exemplo: Controle de usuários.

As ferramentas utilizadas para o desenvolvimento incluem **< linguagem para back-end >** que é uma linguagem de programação utilizada para o Back-end, para front-end foi utilizado **< linguagem para o front-end >** . **< Banco de dados >** atuando como sistema gerenciador de banco de dados relacional e **< gerenciador de container >** para utilizar o ambiente em container.


### Requisitos Funcionais
Respeitando a proposta, o sistema deverá atender os seguintes requisitos:

* **RF1** - Funcionários poderão buscar clientes do sistema.
* **RF2** - Funcionários poderão cadastrar/alterar/deletar/buscar produtos do sistema.
* **RF3** - Clientes poderão criar/alterar/deletar seus pedidos
* **RF3** - Clientes poderão criar/alterar/deletar suas informações de cadastro.


> O requisito funcional está relacinado as funcionalidades citadas. Por exemplo "Geração de relatório de determinado período de vendas". [Verifique mais detalhes aqui](https://codificar.com.br/requisitos-funcionais-nao-funcionais/).

## Regras de Negócio

_Pedido_

**RGN1** -  O cliente só fará o pedido se estiver cadastrado e logado.

_Mudança/cancelamento do pedido_

**RGN2** - O cliente poderá deletar ou alterar o pedido, contanto que esteja devidadamente logado no sistema com seu email e senha.

> As regras de negócio estão relacionadas as dependencias do sistema, por exemplo "depois de x tempo" ou "para clientes de x perfil".

## DER

**DER** - *Visão geral das entidades e relacionamentos*



<a data-flickr-embed="true" href="https://www.flickr.com/photos/200770519@N03/53757582498/in/dateposted-public/" title="DER"><img src="https://live.staticflickr.com/65535/53757582498_27ab7091f4_w.jpg" width="400" height="191" alt="DER"/></a><script async src="//embedr.flickr.com/assets/client-code.js" charset="utf-8"></script>">

> Imagine que fosse necessário enviar um email sempre que realizado o login, esse email deveria estar no fluxograma. Esse fluxograma pode ser mais simples, apenas com o objetivo de validar com o cliente que as dependências de negócio estão validadas em cada caso de negócio.

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


