FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY target/spring-java-app-0.0.1-SNAPSHOT.jar appp.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","appp.jar"]
