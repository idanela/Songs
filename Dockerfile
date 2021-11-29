FROM   openjdk:17-alpine

COPY target/songs-0.0.1-SNAPSHOT.jar /demo.jar

CMD java -jar /demo.jar