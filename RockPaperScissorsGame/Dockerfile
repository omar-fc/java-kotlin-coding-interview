FROM maven:3.9.6-eclipse-temurin-21 AS build

WORKDIR /app

COPY pom.xml .

# Download dependencies (this layer will be cached if pom.xml doesn't change)
RUN mvn dependency:go-offline -B

COPY src ./src

# Compile the application and copy dependencies that are needed at runtime
RUN mvn -Dorg.slf4j.simpleLogger.log.org.apache.maven.cli.transfer.Slf4jMavenTransferListener=warn  compile dependency:copy-dependencies -DincludeScope=runtime -DskipTests

FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# Copy compiled classes and dependencies from the build stage
COPY --from=build /app/target/classes ./classes
COPY --from=build /app/target/dependency ./lib

# Create a non-root user
RUN addgroup -S appgroup && adduser -S appuser -G appgroup
USER appuser

ENTRYPOINT ["java", "-cp", "classes:lib/*", "com.hadsol.MainKt"]
