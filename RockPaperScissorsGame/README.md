# Rock Paper Scissors Game

A simple Rock Paper Scissors game implementation in Kotlin that plays 100 rounds between two players: one always choosing rock and another choosing randomly.

## Prerequisites

- Java JDK 21 or higher
- Maven 3.9.6
- Docker (optional)

## Building and Running the Application

### Using Maven

1. Clone the repository:
```bash
git clone https://github.com/omar-fc/java-kotlin-coding-interview
cd RockPaperScissorsGame
```
2. Build the application:
```bash
./mvnw clean package -DskipTests
```

3. Run the application:
```bash
java -jar target/*-with-dependencies.jar
```

### Using Docker

You have two options to run the application using Docker:

#### Option 1: Pull and Run the Image from Docker Hub

```bash
# Pull the image
docker pull omar077/rock-paper-scissors-game

# Run the container
docker run omar077/rock-paper-scissors-game
```

#### Option 2: Build and Run Locally using Dockerfile

1. Clone the repository:
```bash
git clone https://github.com/omar-fc/java-kotlin-coding-interview
cd RockPaperScissorsGame
```

2. Build the Docker image:
```bash
docker build -t rock-paper-scissors-game .
```

3. Run the container:
```bash
docker run rock-paper-scissors-game
```

## Expected Output

The application will play 100 rounds and display results in the following format:
```
Player A wins XX of 100 games
Player B wins YY of 100 games
Draws: ZZ of 100 games
```

## Project Structure

```
src/
├── main/
│   └── kotlin/
│       └── com/
│           └── hadsol/
│               ├── game/
│               │   ├── Choice.kt
│               │   ├── Game.kt
│               │   ├── GameStatistics.kt
│               │   └── Player.kt
│               └── Main.kt
└── test/
    └── kotlin/
        └── com/
            └── hadsol/
                └── game/
                    ├── GameTest.kt
                    ├── ChoiceTest.kt
                    └── GameStatisticsTest.kt
```

## Testing

Run the tests using Maven:
```bash
git clone https://github.com/omar-fc/java-kotlin-coding-interview
cd RockPaperScissorsGame && ./mvnw test
```

## Docker Image Details

The Docker image is built using a multi-stage build process:
- Base image: `maven:3.9.6-eclipse-temurin-21` for building
- Runtime image: `eclipse-temurin:21-jre-alpine` for a smaller footprint
- Runs as a non-root user for security
- Published on Docker Hub as `omar077/rock-paper-scissors-game`
