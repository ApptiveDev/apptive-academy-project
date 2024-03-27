FROM openjdk:17
ARG JAR_FILE=*.jar
ENV DB_HOSTNAME my-db
EXPOSE 8080
COPY ${JAR_FILE} app.jar
# CMD ["/bin/sleep", "5"]
# ENTRYPOINT ["java","-jar","/app.jar"]

