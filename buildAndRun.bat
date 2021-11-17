@echo off
call mvn clean package
call docker build -t ma.lahrach/LahrachCustomerApp .
call docker rm -f LahrachCustomerApp
call docker run -d -p 9080:9080 -p 9443:9443 --name LahrachCustomerApp ma.lahrach/LahrachCustomerApp