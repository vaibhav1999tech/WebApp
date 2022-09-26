FROM openjdk
RUN mkdir /opt/app
COPY WebAppAss.jar /opt/app
CMD ["java", "-jar", "/opt/app/WebAppAss.jar"]