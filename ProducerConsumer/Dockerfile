FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . .

RUN ./gradlew bootJar

EXPOSE 8080

CMD ["java", "-jar", "app/build/libs/app.jar"]
