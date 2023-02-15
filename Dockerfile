FROM openjdk:17-jdk-alpine
LABEL org.opencontainers.image.authors="baeldung.com"
COPY target/server-springboot-0.0.1-SNAPSHOT.war runnable.war
ENTRYPOINT [ "java", "-jar", "/runnable.war" ]