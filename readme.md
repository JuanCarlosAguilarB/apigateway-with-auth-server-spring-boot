# Spring Boot API Gateway with Auth Server and JWT Example

This project demonstrates how to set up an API Gateway with an Authentication Server using JWT (JSON Web Tokens) authentication. It utilizes Spring Boot along with Eureka Server for service discovery and Config Server for centralized configuration management.

## Overview

This project serves as an example of implementing an API Gateway to manage authentication and routing for microservices in a Spring Boot environment. It showcases the following components:

- **API Gateway**: Centralized entry point for handling requests, routing them to the appropriate microservices, and managing authentication using JWT.
- **Authentication Server**: Provides authentication and issues JWT tokens to users.
- **Eureka Server**: Service registry for service discovery.
- **Config Server**: Centralized configuration management for microservices.

## Prerequisites

Before running this project, ensure you have the following installed:

- Java Development Kit (JDK) 17 or higher
- Gradle
- Docker (optional, for running Eureka Server and Config Server in containers)

## Installation

1. Clone this repository:

    ```bash
    git clone https://github.com/JuanCarlosAguilarB/apigateway-with-auth-server-spring-boot.git
    ```

2. Build the project:

    ```bash
    cd spring-boot-api-gateway-example
    ```

3. Run Eureka Server and Config Server (if not using Docker):

    ```bash
    # Assuming you have Docker installed
    docker-compose up -d
    ```

## Usage

1. Access the Eureka Server dashboard to ensure all microservices are registered:

    ```
    http://localhost:8761/
    ```

2. Obtain JWT tokens from the Authentication Server:

    ```
    POST http://localhost:8081/login/v1/
    ```

   Include the client credentials and user credentials in the request body. Refer to the Authentication Server documentation for details.

3. Use the obtained JWT token to access protected resources via the API Gateway.

## Contributing

Contributions are welcome! Please follow these guidelines when contributing to the project:

- Fork the repository
- Create a new branch for your feature or bug fix
- Make your changes and test thoroughly
- Submit a pull request to the `develop` branch

## License

This project is licensed under the [MIT License](LICENSE).
