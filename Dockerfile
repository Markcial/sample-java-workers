FROM openjdk:jre-alpine

ADD ./build/distributions/sample-groovy-worker.tar /srv

CMD ["/srv/sample-groovy-worker/bin/sample-groovy-worker"]