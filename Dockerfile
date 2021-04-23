FROM maven:3.6-openjdk-8

RUN apt update && apt install -y build-essential