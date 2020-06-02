FROM clojure:openjdk-14-tools-deps-alpine

WORKDIR /build

RUN apk add --update --no-cache nodejs-npm

RUN npm config set cache /build/.npm --global

RUN npm install -g shadow-cljs

ENTRYPOINT ["shadow-cljs"]
