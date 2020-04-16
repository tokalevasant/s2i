FROM openjdk:8-jdk-alpine
ARG JAR_FILE=./target/*.jar

#COPY target/*.jar app.jar

ADD https://github.com/tokalevasant/s2i/blob/master/go-team-docker/target/go-team-docker-0.0.1-SNAPSHOT.jar ./app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]
