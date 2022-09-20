FROM maven:latest
COPY . .
COPY /target/HospitalManagement-0.0.1SNAPSHOT.jar docterdetails.jar
CMD java -jar docterdetails.jar