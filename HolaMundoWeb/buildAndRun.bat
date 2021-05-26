@echo off
call mvn clean package
call docker build -t com.mycompany/HolaMundoWeb .
call docker rm -f HolaMundoWeb
call docker run -d -p 9080:9080 -p 9443:9443 --name HolaMundoWeb com.mycompany/HolaMundoWeb