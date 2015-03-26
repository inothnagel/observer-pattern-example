#!/bin/bash
docker build -t inothnagel/observer-pattern-example .
docker run -it --rm --name observer-pattern-example -w "/usr/src/myapp/bin" inothnagel/observer-pattern-example $1

