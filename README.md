# Cloudstate samples

## Friends service - Java implementation

This is an implementation of the friends service, which is part of Lightbend Cloudstate Chat sample.

The user code is written in Java and uses a 100% Java toolchain (no Scala tools needed).

### Preparing to build

Install Maven 

http://maven.apache.org/download.cgi

### Build the package

```
mvn compile
mvn package
```

### Running

java -jar target/friends-0.1.0.jar

### Build the Docker image

Cloudstate deployment requires your code to run in a container. The following process builds the container.

```
mvn io.fabric8:docker-maven-plugin:0.26.1:build
mvn io.fabric8:docker-maven-plugin:0.26.1:push
```

### TODO

Running in a Kubernetes cluster

Running in Lightbend Cloudstate (managed platform)





