FROM maven:3.9.8-eclipse-temurin-22

RUN mkdir /opt/app

WORKDIR /opt/app

COPY . .

CMD [ "mvn", "spring-boot:run" ]
