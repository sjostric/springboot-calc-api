#!/bin/bash

#create backend
kubectl create -f calc-app-deployment.yaml,calc-app-service.json

#create API service
kubectl create -f calc-app-api-deployment.yaml,calc-app-api-service.json

#list services
kubectl get services
