## Tivic Test Backend

Este projeto é uma API back-end desenvolvida em Spring Boot 3 para gerenciamento de acidentes. Ele utiliza uma arquitetura limpa e está conectado a um banco de dados PostgreSQL.
Instruções para Configuração e Execução do Projeto

1. Pré-requisitos

   - Java 17 ou superior instalado.
   - Maven instalado.
   - Banco de dados PostgreSQL configurado e rodando.

2. Configurar o Banco de Dados

   - No arquivo src/main/resources/application.properties, configure a conexão com seu banco de dados PostgreSQL.

properties

spring.application.name=tivic-test-backend
spring.datasource.url=jdbc:postgresql://your-db-connection/your-db-name
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Explicação das propriedades:

    spring.datasource.url: URL de conexão com o banco de dados PostgreSQL.
    spring.datasource.username: Nome de usuário do banco de dados.
    spring.datasource.password: Senha do banco de dados.
    spring.jpa.hibernate.ddl-auto: Define o comportamento de geração do esquema do banco. O valor update mantém o banco de dados atualizado sem perder dados.
    spring.jpa.show-sql: Exibe as queries SQL no console.

3. Instalar Dependências e Compilar o Projeto

No diretório raiz do projeto, execute o comando abaixo para instalar as dependências e compilar o código.

bash

./mvnw clean install

4. Executar o Projeto

Depois de configurar o banco de dados e instalar as dependências, você pode executar o projeto com o comando:

bash

./mvnw spring-boot:run

5. Documentação da API (Swagger)

A documentação da API está disponível via Swagger após a execução do projeto. Acesse a documentação no seguinte endereço:

bash

http://localhost:8080/swagger-ui/index.html

Aqui você encontrará todos os endpoints disponíveis para uso. 6. Testes Unitários

O projeto contém testes unitários básicos para garantir a integridade do código. Você pode executá-los com o comando:

bash

./mvnw test

Documentação Técnica
Arquitetura Utilizada: Arquitetura Limpa (Clean Architecture)

Neste projeto, foi adotada a Arquitetura Limpa. Esse padrão oferece vários benefícios e foi escolhido para garantir que o sistema seja escalável, fácil de manter e independente de frameworks.
Por que Clean Architecture?

    Separação de responsabilidades: A arquitetura limpa divide o projeto em camadas, onde cada camada tem uma responsabilidade clara. Isso mantém o código organizado e facilita a manutenção e o entendimento do sistema.

    Independência de frameworks: A arquitetura limpa minimiza a dependência de frameworks e bibliotecas externos, permitindo que o core da aplicação não seja impactado por mudanças nos frameworks.

    Facilidade de testes: Como as regras de negócio estão isoladas das camadas de interface (como controladores e infraestrutura), fica mais fácil realizar testes unitários e de integração, assegurando a qualidade do código.

Camadas da Arquitetura

    Camada de Domínio: Contém as regras de negócio, representadas por Entidades e Use Cases. Essas classes estão livres de dependências externas e são reutilizáveis e fáceis de testar.

    Camada de Aplicação: Implementa a lógica de orquestração do sistema e gerencia as chamadas às regras de negócio. Nessa camada, temos DTOs e Services que implementam as regras de negócio baseadas nas interações do sistema.

    Camada de Infraestrutura: Responsável pela comunicação com bancos de dados, APIs externas e bibliotecas específicas. Aqui, utilizamos Repositórios e configurações específicas, como a integração com o PostgreSQL.

Principais Componentes:

    Controller: Responsável por receber as requisições HTTP e orquestrar as chamadas para as camadas de aplicação.
    Service: Contém a lógica de orquestração e as regras de negócio.
    Repository: Interface para a comunicação com o banco de dados, utilizando JPA.

Tecnologias Utilizadas

    Spring Boot 3
    PostgreSQL
    Maven
    Hibernate (JPA)
    Swagger (para a documentação da API)
    Arquitetura Limpa (Clean Architecture)

Como Contribuir

    Faça um fork do projeto.
    Crie uma branch (git checkout -b feature/NovaFeature).
    Faça commit das suas alterações (git commit -m 'Adiciona nova feature').
    Faça push para a branch (git push origin feature/NovaFeature).
    Crie um novo Pull Request.
