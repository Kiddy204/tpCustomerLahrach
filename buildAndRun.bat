@echo off
call mvn clean package
call docker build -t ma.lahrach/tpCustomerLahrach .
call docker rm -f tpCustomerLahrach
call docker run -d -p 9080:9080 -p 9443:9443 --name tpCustomerLahrach ma.lahrach/tpCustomerLahrach