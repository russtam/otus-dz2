FROM maven:3.9.11-eclipse-temurin-21-noble AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src/ src/
RUN mvn package
FROM amd64/eclipse-temurin:21-jre-noble
COPY --from=build /app/target/otus-dz-2-*.jar /app.jar
EXPOSE 8080
CMD ["java", "-jar", "/app.jar"]