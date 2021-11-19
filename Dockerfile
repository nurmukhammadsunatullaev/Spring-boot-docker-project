FROM openjdk:8
ADD target/four-application-service.jar four-application-service.jar
ENTRYPOINT ["java","-jar","/four-application-service.jar"]