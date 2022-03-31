# Build Image
FROM eclipse-temurin:17-jre-alpine
RUN mkdir /opt/app
COPY application/target/app.jar /opt/app/
ENTRYPOINT ["java","-jar","/opt/app/app.jar"]