FROM openjdk:17.0.2-slim
ARG JAR_FILE=target/Arquitectura-0.0.1-SNAPSHOT.jar
EXPOSE 8088
COPY ${JAR_FILE} Arquitectura-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Arquitectura-0.0.1-SNAPSHOT.jar"]