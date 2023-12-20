# Spring Boot Logging with ELK Stack Example

This repository contains a simple Spring Boot application that demonstrates how to set up logging with the ELK Stack (Elasticsearch, Logstash, Kibana).

## Prerequisites

Make sure you have the following installed:

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Docker](https://www.docker.com/get-started)

## Getting Started

1. **Clone this repository:**

    ```bash
    git clone https://github.com/semihcaliskan13/spring-boot-elk-logging-example.git
    cd spring-boot-elk-logging-example
    ```

2. **Run the ELK Stack using Docker Compose:**

    ```bash
    docker-compose up
    ```

    This command will start Elasticsearch, Logstash, and Kibana containers.

3. **Build and run the Spring Boot application:**

    ```bash
    ./mvnw clean install
    ./mvnw spring-boot:run
    ```

    The Spring Boot application will start, and logs will be sent to Logstash.

4. **Open Kibana in your browser:**

    Visit [http://localhost:5601](http://localhost:5601) to access the Kibana dashboard.

5. **Set up an index pattern in Kibana:**

    - Go to **Management** > **Index Patterns**.
    - Enter the index pattern name (default is `logstash-*`) and click **Next**.
    - Select the timestamp field and click **Create index pattern**.

6. **Explore logs in Kibana:**

    - Go to **Discover** to explore and visualize your logs.

## Customizing Logging

The Spring Boot application is configured to use Logback as the logging framework. You can customize the logging configuration in the `src/main/resources/logback-spring.xml` file.

