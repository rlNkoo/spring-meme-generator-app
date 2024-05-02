#1: Spring Boot building
FROM maven:3.9.6-eclipse-temurin as spring-boot-build
COPY . /app
WORKDIR /app
RUN mvn clean package
RUN mv ./target/*.jar ./target/meme-generator-app-spring-boot.jar

FROM node:14 as angular-build
WORKDIR /app
RUN npm install
RUN npm run build
ENTRYPOINT ["java", "-jar", "meme-generator-app-spring-boot.jar"]