FROM java:7
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac -classpath "src" -d bin src/*.java
CMD ["java", "Main"]
