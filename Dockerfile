FROM maven:3.8-openjdk-17-slim

WORKDIR /code

RUN apt update && apt install -y build-essential