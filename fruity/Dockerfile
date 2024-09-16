# Use the Eclipse Temurin 21 JDK base image
FROM eclipse-temurin:21-jdk-alpine

# Set the working directory in the container
WORKDIR /fruity

# Copy the Maven configuration file and source code into the container
COPY pom.xml ./ 
COPY src ./src

# Install Maven (since the base image does not include Maven)
RUN apk add --no-cache maven

# Build the application using Maven, creating a fat JAR with dependencies
RUN mvn clean package -DskipTests

#

# Expose the port the app will run on
EXPOSE 8080

# Command to run the JAR file
CMD ["java", "-jar", "/fruity/target/fruity-1.0-SNAPSHOT-jar-with-dependencies.jar"]
