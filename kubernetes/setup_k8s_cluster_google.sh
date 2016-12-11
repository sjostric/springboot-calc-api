#!/bin/bash

### Push Docker images

# tag docker image
#docker tag 67f093b032f3 eu.gcr.io/burnished-fold-149817/dotnet-calc:v1

# push docker images
#gcloud docker -- push  eu.gcr.io/burnished-fold-149817/dotnet-calc:v1


### Kubernetes / Google Cloud

#login
#gcloud auth application-default login

# pre and create cluster
gcloud config set compute/zone europe-west1-b
gcloud container clusters create cluster-test

# connect to cluster
gcloud container clusters get-credentials cluster-test --zone europe-west1-b --project burnished-fold-149817

# setup proxy to the cluster (direct browser to: http://localhost:8001/ui)
kubectl proxy  


