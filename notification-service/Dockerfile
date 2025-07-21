# Use official OpenJDK 17 base image
FROM eclipse-temurin:17-jdk-alpine

# Create app directory
WORKDIR /app

# Copy jar from target
COPY target/notification-service-0.0.1-SNAPSHOT.jar app.jar

# Expose port (if needed by Kubernetes Service)
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]

