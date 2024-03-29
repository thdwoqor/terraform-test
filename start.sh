#!/bin/bash
source ~/.bashrc

kill -9 $(lsof -i :8080)
cd /home/ec2-user/my-web-server/build/libs/
nohup java -jar test-0.0.1-SNAPSHOT.jar &> webserverlog.log &
