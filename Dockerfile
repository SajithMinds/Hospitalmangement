FROM maven:latest
COPY . .
COPY /target/HospitalManagement-0.0.1-SNAPSHOT.jar app.jar
CMD java -jar app.jar