.PHONY: default test docker-build docker-test
default: docker-test

test:
	mvn test clean

docker-build:
	docker build .. -t codiumteam/tdd-training-java

docker-test:
	docker run --rm -v ${PWD}:/code -v ${PWD}/../.m2:/root/.m2 codiumteam/tdd-training-java make test