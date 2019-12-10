# Try [shadow-cljs](http://shadow-cljs.org/)

Experiments with [shadow-cljs](http://shadow-cljs.org/), e.g. run it
"dockerized".

## Docker build environment

Prepare the env:

```sh
docker-compose build
```

Run:

```sh
./shadow-cljsw [args]
```

## Dev environment

**This is for `vim-fireplace`.**

Start the application:

```sh
./shadow-cljsw watch app
```

The nREPL starts at the fixed port `3333`, which is also visible to
Fireplace via the file `.nrepl-port`.  So in Fireplace, once e.g.
`src/main/app/main.cljs` is opened, run:

```vimscript
:Piggieback :app
```

(`:app` is the name of the running application)
