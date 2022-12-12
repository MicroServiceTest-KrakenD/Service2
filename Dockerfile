FROM openjdk:12-jdk-alpine
COPY ./build/libs/demo2-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]