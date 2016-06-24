FROM node:6.2.2
MAINTAINER Sergej Werfel

RUN npm install -g concurrently lite-server typescript typings

EXPOSE 3000 30001

ENV APP_LOCATION /usr/src/app

VOLUME $APP_LOCATION
WORKDIR $APP_LOCATION

CMD [ "npm","install","--no-bin-links" ]