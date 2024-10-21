#FROM openjdk:17-jdk
#EXPOSE 8081
#ADD target/BasicSpringbootApp-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java" , "-jar" , "/app.jar"]


FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/BasicSpringbootApp-0.0.1-SNAPSHOT.jar /app/BasicSpringbootApp-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "BasicSpringbootApp-0.0.1-SNAPSHOT.jar"]