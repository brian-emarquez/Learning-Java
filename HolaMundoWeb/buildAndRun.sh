#!/bin/sh
mvn clean package && docker build -t com.mycompany/HolaMundoWeb .
docker rm -f HolaMundoWeb || true && docker run -d -p 9080:9080 -p 9443:9443 --name HolaMundoWeb com.mycompany/HolaMundoWeb