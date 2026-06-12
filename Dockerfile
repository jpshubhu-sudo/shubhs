FROM eclipse-temurin
LABEL authors = "shubham"
WORKDIR /myapp
COPY target/demo-0.0.1-SNAPSHOT.jar myapp.jar
ENTRYPOINT ["java", "-jar", "myapp.jar"]