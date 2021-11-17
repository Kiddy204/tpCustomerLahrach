#!/bin/sh
mvn clean package && docker build -t ma.lahrach/LahrachCustomerApp .
docker rm -f LahrachCustomerApp || true && docker run -d -p 9080:9080 -p 9443:9443 --name LahrachCustomerApp ma.lahrach/LahrachCustomerApp