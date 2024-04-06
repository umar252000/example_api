FROM openjdk:18
ADD target/example_api.jar example_api.jar
ENTRYPOINT [ "java","-jar","/example_api.jar" ]