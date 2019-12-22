# order-management-quarkus

## General
Order management implementation to exercise Quarkus.

Quarkus is found here: https://quarkus.io/.

Quarkus is:

* Kubernetes Native Java stack
* Tailored for OpenJDK HotSpot and GraalVM
* Fast boot time
* Low RSS memory
* Near instant scale up
* High density memory utilization
* Targets container orchestration platforms like Kubernetes
* Unified configuration. Zero config, live reload.

## JDK

I'm using OpenJDK 11 as the base JVM

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./gradlew quarkusDev
```

## Packaging and running the application

The application is packageable using `./gradlew quarkusBuild`.
It produces the executable `order-management-quarkus-0.0.1-SNAPSHOT-runner.jar` file in `build` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `build/lib` directory.

The application is now runnable using `java -jar build/order-management-quarkus-0.0.1-SNAPSHOT-runner.jar`.

If you want to build an _über-jar_, just add the `--uber-jar` option to the command line:
```
./gradlew quarkusBuild --uber-jar
```

## Creating a native executable

You can create a native executable using: `./gradlew buildNative`.

Or you can use Docker to build the native executable using: `./gradlew buildNative --docker-build=true`.

You can then execute your binary: `./build/order-management-quarkus-0.0.1-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/gradle-tooling#building-a-native-executable .
