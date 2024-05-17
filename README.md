# Projeto de Estudo: Mapeamento objeto-relacional com JPA/Hibernate

<div align="center">
  <img alt="Java" title="Java" src="https://github.com/Jordaobm/secao-22-java-ee-mapeamento-objeto-relacional-com-jpa-hibernate/blob/main/doc/java.png" width="300px" />
</div>

## Descrição

Este é um projeto simples desenvolvido com o objetivo de aprender e aplicar os conceitos de desenvolvimento de APIs RESTful utilizando a linguagem Java. O projeto é uma implementação simplificada de uma Classe Pessoa.java e suas propriedades. 

Este projeto foi desenvolvido durante o curso **"Java COMPLETO Programação Orientada a Objetos + Projetos"** ministrado pelo professor Nelio Alves na plataforma UDEMY. O projeto específico faz parte da Seção 22 do curso: **"Java EE - Mapeamento objeto-relacional com JPA / Hibernate"**.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal do projeto.
- **JPA / Hibernate**: Framework de mapeamento objeto-relacional para gerenciamento de dados.
- **Docker**: Ferramenta para criar e gerenciar containers.
- **Docker Compose**: Ferramenta para definir e gerenciar multi-containers Docker.
- **Maven**: Ferramenta de automação de compilação e gerenciamento de dependências.

## Como Executar o Projeto

### Pré-requisitos

- Java JDK 17 ou superior
- Maven
- Docker
- Docker Compose

### Passos para Execução

1. **Clone o repositório:**
   ```sh
   git clone https://github.com/Jordaobm/secao-22-java-ee-mapeamento-objeto-relacional-com-jpa-hibernate.git
   ```
2. **Navegue até o diretório do projeto:**
   ```sh
   cd secao-22-java-ee-mapeamento-objeto-relacional-com-jpa-hibernate
   ```
3. **Edite o arquivo persistence.xml para que acesse o ip do seu container:**
   ```sh
   <property name="javax.persistence.jdbc.url"
                      value="jdbc:mysql://192.168.26.130:3306/mysql?allowPublicKeyRetrieval=true&amp;useSSL=false"/>
   ```
4. **Compile o projeto utilizando Maven:**
   ```sh
   mvn clean install
   ```
5. **Crie e inicie os containers Docker:**
   ```sh
   docker-compose up --build
   ```

## Docker

Para facilitar a execução da aplicação e do banco de dados, foram criados um `Dockerfile` e um `docker-compose.yml`. Esses arquivos permitem subir a aplicação e o banco de dados em containers Docker de forma rápida e simples.

### Dockerfile

O `Dockerfile` contém as instruções para construir a imagem Docker da aplicação.

### Docker Compose

O `docker-compose.yml` define os serviços necessários para a aplicação, incluindo o serviço da aplicação e o serviço do banco de dados.

## Contato

Para mais informações sobre o curso e o projeto, entre em contato:

- **Professor:** Nelio Alves
- **Plataforma:** UDEMY
- **Curso:** [Java COMPLETO Programação Orientada a Objetos + Projetos](https://www.udemy.com/course/java-completo-programacao-orientada-a-objetos-projetos/)
