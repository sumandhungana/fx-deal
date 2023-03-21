# 1st stage, build the app
#FROM adoptopenjdk/openjdk16-openj9:jdk-16_36_openj9-0.25.0-slim
#FROM openjdk:17-alpine
FROM ibm-semeru-runtimes:open-17-jdk-focal
WORKDIR /app
ADD ./target/fx-deal-0.1.jar .

CMD ["java", "-jar","fx-deal-0.1.jar"]


EXPOSE 8080
