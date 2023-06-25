FROM openjdk:18
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/backup-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} back-up.jar
ENTRYPOINT ["java", "-jar","back-up.jar"]