# Tivic Test Backend

Este projeto é uma API back-end desenvolvida em Spring Boot 3 para gerenciamento de acidentes. Ele utiliza uma arquitetura limpa e está conectado a um banco de dados PostgreSQL.

Instruções para Configuração e Execução do Projeto:

## Pré-requisitos

   - Java 17 ou superior instalado.
   - Maven instalado.
   - Banco de dados PostgreSQL configurado e rodando.

## Passos para rodar o projeto

1. Configurar o Banco de Dados

   No arquivo src/main/resources/application.properties, configure a conexão com seu banco de dados PostgreSQL.

      Exemplo:
      
             spring.datasource.url: URL de conexão com o banco de dados PostgreSQL.
             spring.datasource.username: Nome de usuário do banco de dados.
             spring.datasource.password: Senha do banco de dados.
             spring.jpa.hibernate.ddl-auto: Define o comportamento de geração do esquema do banco. O valor update mantém o banco de dados atualizado sem perder dados.
             spring.jpa.show-sql: Exibe as queries SQL no console.

2. Instalar Dependências e Compilar o Projeto

   No diretório raiz do projeto, execute o comando abaixo para instalar as dependências e compilar o código.
   
         ./mvnw clean install

3. Executar o Projeto

   Depois de configurar o banco de dados e instalar as dependências, você pode executar o projeto com o comando:
   
         ./mvnw spring-boot:run

4. Documentação da API (Swagger)

   A documentação da API está disponível via Swagger após a execução do projeto. Acesse a documentação no seguinte endereço:
   
            http://localhost:8080/swagger-ui/index.html

# Documentação Técnica
## Arquitetura Utilizada: Arquitetura Limpa (Clean Architecture)

Neste projeto, foi adotada a Arquitetura Limpa. Esse padrão oferece vários benefícios e foi escolhido para garantir que o sistema seja escalável, fácil de manter e independente de frameworks.
Por que Clean Architecture?

 - Separação de responsabilidades: A arquitetura limpa divide o projeto em camadas, onde cada camada tem uma responsabilidade clara. Isso mantém o código organizado e facilita a manutenção e o entendimento do sistema.
 - Independência de frameworks: A arquitetura limpa minimiza a dependência de frameworks e bibliotecas externos, permitindo que o core da aplicação não seja impactado por mudanças nos frameworks.
 - Facilidade de testes: Como as regras de negócio estão isoladas das camadas de interface (como controladores e infraestrutura), fica mais fácil realizar testes unitários e de integração, assegurando a qualidade do código.

Camadas da Arquitetura

 - Camada de Domínio: Contém as regras de negócio, representadas por Entidades e Use Cases. Essas classes estão livres de dependências externas e são reutilizáveis e fáceis de testar.
 - Camada de Aplicação: Implementa a lógica de orquestração do sistema e gerencia as chamadas às regras de negócio. Nessa camada, temos DTOs e Services que implementam as regras de negócio baseadas nas interações do sistema.
 - Camada de Infraestrutura: Responsável pela comunicação com bancos de dados. Aqui, são utilizados Repositórios e configurações específicas, como a integração com o PostgreSQL.
 - Camada de Interfaces: Responsável por lidar com as interações externas, como as APIs e as interfaces de usuário. Aqui, essa camada inclui os Controllers e as interfaces de comunicação com o usuário.

Principais Componentes:

 - Controller: Responsável por receber as requisições HTTP e orquestrar as chamadas para as camadas de aplicação.
 - Service: Contém a lógica de orquestração e as regras de negócio.
 - Repository: Interface para a comunicação com o banco de dados, utilizando JPA.
 - Model: Contém as entidades da aplicação.

## Tecnologias Utilizadas

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white) ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white) ![Apache Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white) ![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white) ![Swagger](https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=black) ![Clean Architecture](https://img.shields.io/badge/Clean%20Architecture-4B4B77?style=for-the-badge)

## Tratamento de Erros

Na Camada de Interfaces, além de lidar com as requisições e respostas, há um mecanismo robusto de tratamento de erros implementado para garantir que o sistema responda de forma adequada e padronizada aos usuários quando algo inesperado acontece. Esse tratamento é feito principalmente com o uso de Global Exception Handlers no Spring Boot.
Tratamento de Erros:

 - Global Exception Handler: Utilizo uma classe anotada com @ControllerAdvice, que captura exceções lançadas em toda a aplicação. Isso permite que todas as exceções sejam tratadas de maneira centralizada, fornecendo respostas        claras e uniformes, geralmente no formato JSON, contendo detalhes sobre o erro.

 - Custom Exceptions: São criadas exceções personalizadas para diferentes cenários de erro (como ResourceNotFoundException, InvalidInputException, etc.). Isso permite que cada tipo de erro tenha uma resposta apropriada.

 - HTTP Status Codes: Cada erro tratado é mapeado para um código de status HTTP correspondente, como 404 Not Found, 400 Bad Request, 500 Internal Server Error, etc., facilitando a identificação da natureza do erro por quem está      consumindo a API.

Dessa forma, a camada de interfaces assegura que os erros sejam tratados de forma coerente e padronizada, melhorando a experiência do usuário e facilitando o processo de depuração.

## Documentação

A aplicação está toda documentada com o swagger, com intúito de auxiliar o consumidor da mesma, exibindo cada rota disponível e o que cada uma tem de responsabilidade.
