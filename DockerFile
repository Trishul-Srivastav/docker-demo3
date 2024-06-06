FROM amazoncorretto:17.0.7-alpine
RUN echo "started building docker image"
EXPOSE 8081
COPY target/docker-demo3-0.0.1-SNAPSHOT.jar docker-demo3.jar
RUN echo "docker built successful"
ENTRYPOINT ["java","-jar","docker-demo3.jar"]