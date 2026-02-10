/root-project
|-- settings.gradle
|-- build.gradle
|-- gradlew
|-- gradlew.bat
|-- /buildSrc
|   |-- build.gradle
|   |-- /src/main/groovy/...
|-- /app-service-1
|   |-- build.gradle
|   |-- /src/main/java/...
|-- /app-service-2
|   |-- build.gradle
|   |-- /src/main/java/...
|-- /shared-library
|   |-- build.gradle
|   |-- /src/main/java/...

- buildSrc: A directory in the root project where shared build logic and convention plugins are defined to be used by all subprojects. 

- commands
  ./gradlew :app-service-1:bootRun
  ./gradlew clean build (all project)
  ./gradlew clean :app-service-1:build