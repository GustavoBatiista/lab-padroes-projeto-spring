# Usa uma imagem com Java 17 (compatível com Spring Boot 3)
FROM eclipse-temurin:17-jdk-alpine

# Pasta de trabalho dentro do container
WORKDIR /app

# Copia o JAR gerado para dentro do container
COPY target/*.jar app.jar

# Expõe a porta da aplicação
EXPOSE 8080

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
