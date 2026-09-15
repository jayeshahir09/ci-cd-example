FROM openjdk:28-ea-trixie
LABEL authors="jayes"

WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar","app.jar"]