FROM openjdk:jre-alpine

RUN apk add --update bash && rm -rf /var/cache/apk/*

ADD ./build/distributions/sample-java-workers.tar /srv

CMD ["/srv/sample-java-workers/bin/sample-java-workers"]
