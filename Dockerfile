
FROM maven:3.8.6-openjdk-17 AS build

WORKDIR /app

COPY . /app

RUN mvn clean package

FROM openjdk:17-alpine

EXPOSE 8080

COPY --from=build app/target/physics_simulator-0.0.1-SNAPSHOT.jar /app/physics_simulator-0.0.1-SNAPSHOT.jar



ENTRYPOINT ["java","-jar","/app/physics_simulator-0.0.1-SNAPSHOT.jar"]


