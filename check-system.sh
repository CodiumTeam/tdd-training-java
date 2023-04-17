#!/bin/bash
ERROR=""
OUTPUT=""
function printStatus() {
  if [ $? -ne 0 ]; then
    echo "Error"
    ERROR="${ERROR} \n\n${OUTPUT}"
  else
    echo "Ok"
  fi
}

function validateKata() {
    echo -n "Validating $1..."
    OUTPUT=$($2 2>&1 && $3 2>&1 && $4 2>&1)
    printStatus
}

function validateDocker() {
    echo -n "Validating docker running..."
    (docker ps) > /dev/null
    if [ $? -ne 0 ]; then
      echo "Error"
      echo "Are you sure that you have docker running?"
      echo "If you don't want to install docker, you can open tennis-refactoring-kata and run the tests using your IDE."
      exit -1
    else
      echo "Ok"
    fi

    echo -n "Creating the docker image..."
    (docker build . -t codiumteam/tdd-training-java) > /dev/null
    if [ $? -ne 0 ]; then
      echo "Error"
      echo "Do you have internet connection?"
      exit -1
    else
      echo "Ok"
    fi

    echo -n "Validating docker mount permissions..."
    (docker run --rm -v ${PWD}:/kata codiumteam/tdd-training-java ls) > /dev/null
    if [ $? -ne 0 ]; then
      echo "Error"
      echo "Are you sure that you have permissions to mount your volumes?"
      exit -1
    else
      echo "Ok"
    fi
}

function validateMake() {
  echo -n "Validating make installed..."
    (make -h) > /dev/null
    if [ $? -ne 0 ]; then
      echo "Error"
      echo "Do you have make installed?"
      echo "If you don't want to install make, you can run read how to run the tests opening the Makefile."
      exit -1
    else
      echo "Ok"
    fi
}

validateDocker
validateMake
validateKata fizz-buzz "cd fizz-buzz" "make docker-test"
validateKata roman-numerals "cd roman-numerals" "make docker-test"
validateKata password-validator "cd password-validator" "make docker-test"
validateKata user-registration "cd user-registration" "make docker-test"
validateKata coffee-machine "cd coffee-machine" "make docker-test"

if [ -z "$ERROR" ]; then
  echo "Congratulations! You are ready for the training!"
else
  echo -e "----------------------------------------------------------\n\n$ERROR"
  echo -e "\n\nPlease send an email with the problem you have to info@codium.team\n"
fi
