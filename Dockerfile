FROM openjdk:11
EXPOSE 8888
ADD target/testproject.jar testproject.jar
ENTRYPOINT ["java","-jar","/testproject.jar"]
