🧩 Lab Padrões de Projeto com Spring Boot

Este projeto foi desenvolvido com base no laboratório Lab Padrões de Projeto com Spring Boot, proposto no bootcamp da DIO (Digital Innovation One).

A estrutura, regras de negócio e integração com ViaCEP seguem fielmente a proposta original do laboratório.
As modificações realizadas tiveram como foco boas práticas de execução e conformidade REST.

🔗 Projeto base (DIO):
https://github.com/digitalinnovationone/lab-padroes-projeto-spring

🎯 Objetivo

Demonstrar a aplicação prática de padrões de projeto com Spring Boot, além de realizar pequenas melhorias técnicas voltadas para ambiente real de execução.

✅ Diferenças em relação ao projeto original da DIO

As únicas alterações realizadas além do conteúdo original foram:

🐳 Dockerização da aplicação

Criação de Dockerfile

Geração de imagem Docker

Execução da aplicação em container

Padronização do ambiente de execução

Isso permite rodar o projeto sem necessidade de instalação local de Java ou dependências.

🌐 Ajustes nos status HTTP (REST)

Adequação dos endpoints para retornar status HTTP corretos

Exemplos:

201 Created para POST

200 OK para GET e PUT

204 No Content para DELETE

Esses ajustes tornam a API mais alinhada aos princípios REST.

🛠️ Tecnologias utilizadas

Java 17

Spring Boot

Spring Data JPA

Spring Cloud OpenFeign

H2 Database

Maven

Docker

Swagger / OpenAPI

▶️ Como executar o projeto com Docker
1️⃣ Gerar o JAR
mvn clean package -DskipTests

2️⃣ Criar a imagem Docker
docker build -t lab-padroes-projeto-spring .

3️⃣ Rodar o container
docker run -p 8080:8080 lab-padroes-projeto-spring

📖 Documentação da API

Após subir a aplicação, o Swagger pode ser acessado em:

http://localhost:8080/swagger-ui/index.html

🧠 Observações

O projeto mantém fidelidade total ao laboratório original da DIO

As alterações realizadas focam apenas em:

execução

padronização

boas práticas REST

Não foram adicionadas novas regras de negócio ou funcionalidades extras

👨‍💻 Autor

Gustavo Batista

Projeto desenvolvido a partir de laboratório educacional, com pequenas melhorias técnicas aplicadas para fins de estudo e portfólio.
