FROM openjdk
RUN mkdir /opt/app
COPY WebAppAss/target/WebAppAss-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/WebAppAss-0.0.1-SNAPSHOT.jar"]
