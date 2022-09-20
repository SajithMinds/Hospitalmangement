FROM maven:latest
EXPOSE 8082
ADD target/HospitalManagement-0.0.1SNAPSHOT.jar doctordetails.jar
ENTRYPOINT ["java","-jar","/doctordetails.jar]