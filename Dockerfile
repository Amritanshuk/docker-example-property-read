FROM ubuntu:20.04
RUN apt update -y
RUN apt install -y openjdk-11-jdk
COPY target/docker-env-0.0.1-SNAPSHOT.jar .
CMD java -jar docker-env-0.0.1-SNAPSHOT.jar