# Desafio Técnico Individual – API de Produtos
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/PLGVS/individual-challenge-bagaggio/blob/master/LICENSE) 

# Sobre o projeto
A aplicação consiste em cadastro, consulta, edição e deleção de produtos que são registrados no banco de dados e são acessados através de requisições HTTP via API.

# Endpoints
- GET /produtos: listar todos os produtos
  * Código 200 Ok - Requisição bem sucedida
- GET /produtos/{id}: buscar produto por ID
  * Código 200 Ok - Requisição bem sucedida
  * Código 404 Not Found - Produto não encontrado
- POST /produtos: criar novo produto
  * Código 201 Created - Produto cadastrado com sucesso
- PUT /produtos/{id}: atualizar produto existente
  * Código 200 Ok - Requisição bem sucedida
  * Código 404 Not Found - Produto não encontrado
- DELETE /produtos/{id}: remover produto
  * Código 204 No Content - Produto deletado com sucesso
  * Código 404 Not Found - Produto não encontrado
## Modelo conceitual
![Modelo Conceitual](https://github.com/PLGVS/assets/blob/master/Modelo%20Conceitual%20Bagaggio%20Challenge.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Banco de Dados
- Teste: H2
- Dev: PostgreSQL

# Autor

Pedro Luis Gaspar Vieira de Souza

https://www.linkedin.com/in/pedro-luis-gaspar-vieira-de-souza-02b123211/
