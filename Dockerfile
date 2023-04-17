FROM maven:3.6-openjdk-8

WORKDIR /code

RUN apt update && apt install -y build-essential