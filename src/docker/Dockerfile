FROM clojure:openjdk-14-tools-deps-alpine

RUN apk add --update --no-cache nodejs-npm

RUN npm install -g shadow-cljs

WORKDIR /build

ENTRYPOINT ["shadow-cljs"]
