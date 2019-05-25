FROM openjdk:8
MAINTAINER TechAscent

# This is required for the keyboard-configuration install
ENV TERM xterm
ENV DEBIAN_FRONTEND noninteractive

RUN apt-get -qq update && apt-get -qq install --no-install-recommends curl wget nmap zip unzip

ARG SERVICE
ENV service ${SERVICE:-service}
ADD target/uberjar/${service}.jar /srv/${service}.jar
WORKDIR /srv
CMD "java" "-jar" "/srv/${service}.jar"
