FROM gradle:jdk11
MAINTAINER lordbagger
COPY . /home/workspace/netflix-example/
WORKDIR /home/workspace/netflix-example/
RUN gradle build
ENTRYPOINT gradle bootRun
EXPOSE 8080