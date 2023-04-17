.PHONY: default test docker-build docker-test
default: docker-test

test:
	mvn test clean

docker-build:
	docker build .. -t codiumteam/tdd-training-java

docker-test:
	docker run --rm -v ${PWD}:/opt/project -v ${PWD}/../.m2:/root/.m2 -w /opt/project codiumteam/tdd-training-java make test