FROM openjdk:17
EXPOSE 9090
ADD ./target/spring-docker-git-jenkins-integration.jar spring-docker-git-jenkins-integration.jar
ENTRYPOINT ["java","-jar","/spring-docker-git-jenkins-integration.jar"]