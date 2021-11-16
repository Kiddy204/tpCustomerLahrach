#!/bin/sh
mvn clean package && docker build -t ma.lahrach/tpCustomerLahrach .
docker rm -f tpCustomerLahrach || true && docker run -d -p 9080:9080 -p 9443:9443 --name tpCustomerLahrach ma.lahrach/tpCustomerLahrach