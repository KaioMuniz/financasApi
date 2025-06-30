# Etapa 1: Build
FROM eclipse-temurin:21-jdk AS build

WORKDIR /app

# Copia o pom.xml antes de copiar o src para aproveitar o cache do Docker
COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn
COPY mvnw.cmd .

# Baixa as dependências do Maven (isso pode ser reutilizado se o pom.xml não mudar)
RUN chmod +x mvnw && ./mvnw dependency:go-offline

# Copia os arquivos da aplicação e compila o projeto
COPY src ./src
RUN ./mvnw clean package -DskipTests

# Renomeia o JAR gerado para um nome padrão
RUN cp target/*.jar app.jar

# Etapa 2: Imagem final
FROM eclipse-temurin:21.0.1_12-jre-alpine

WORKDIR /app

# Copia apenas o .jar da etapa anterior
COPY --from=build /app/app.jar .

# Porta padrão do Spring Boot
EXPOSE 8080

# Comando de execução
ENTRYPOINT ["java", "-jar", "app.jar"]
