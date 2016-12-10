FROM java:8
VOLUME /tmp
ADD calc-app-api-1.0.0-SNAPSHOT.jar /app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=cloud","/app.jar"]
