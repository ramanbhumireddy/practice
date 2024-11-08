FROM openjdk:17
EXPOSE 8080
ADD target/practicesbapi.jar practicesbapi.jar
ENTRYPOINT ["java","-jar","/practicesbapi.jar"]