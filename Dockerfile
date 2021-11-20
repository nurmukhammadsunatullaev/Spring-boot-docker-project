FROM openjdk:8
COPY target/*.jar application.jar
ENTRYPOINT ["java","-jar","application.jar"]