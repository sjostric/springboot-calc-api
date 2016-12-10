FROM java:8
VOLUME /tmp
ADD calc-app-1.0.0-SNAPSHOT.jar /app.jar
RUN bash -c 'touch /app.jar'
#ENTRYPOINT ["java","-jar","-Dspring.profiles.active=test,inmemdb","/app.jar"]
ENTRYPOINT ["java","-jar","/app.jar"]
