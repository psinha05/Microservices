Microservices Project with Spring Boot:

📌 Overview

This project demonstrates a complete Microservices architecture built with Java/Spring Boot, implementing service discovery, API gateway routing, 
centralized configuration, authentication, and user data management.

Each service communicates with others via REST APIs and Eureka service discovery, ensuring a scalable and maintainable architecture.


🗂 Project Components

| Component                           | Description                                                                                                                                    |
| ----------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| **netflix-eureka-naming-server**    | Acts as the **service registry**. All microservices register here for discovery, enabling dynamic lookup and load balancing.                   |
| **netflix-zuul-api-gateway-server** | API Gateway for routing requests to appropriate microservices. Handles cross-cutting concerns like authentication, logging, and rate-limiting. |
| **spring-cloud-config-server**      | Provides centralized configuration for all microservices. Ensures consistent properties and secrets across services.                           |
| **user-authentication**             | Handles **user login, JWT token generation, and authentication**. Validates requests before forwarding to downstream services.                 |
| **user-data**                       | Manages user data and database interactions. Exposes endpoints for **CRUD operations** on user information.                                    |



⚡ End-to-End Flow

Here’s how a typical request flows through the system:

1). Client Request

A client (web, mobile, or Postman) sends a request to the API Gateway.


2). API Gateway Routing

Netflix Zuul Gateway intercepts the request, performs authentication checks, logging, and routes the request to the appropriate service (e.g., user-data).


3). Service Discovery

The API Gateway queries Eureka Naming Server to dynamically discover the instance of the microservice to route to. 

4). Authentication

If the route requires authentication, the request goes through user-authentication service:

       *   Validates credentials
       
       *   Issues JWT token
       
       *   Ensures only authenticated requests reach downstream services

       
5). Business Logic Execution

  *  The user-data service receives the request, handled by Spring Boot REST Controllers.

  *  Controllers call Service classes which contain business logic.

  *   Services interact with Repository layer to perform database operations.

    
6). Database Interaction

 *  user-data service uses Spring Data JPA / Hibernate to interact with the database.

 *  Executes queries for CRUD operations, e.g., fetching user info or updating records.

7). Response Back to Client

    * The microservice returns the result to Zuul Gateway, which forwards it back to the client.
    
    * Any streaming, pagination, or formatting is handled by the gateway or service layer.


    🔗 Communication Diagram

    <img width="1558" height="811" alt="mermaid-diagram(1)" src="https://github.com/user-attachments/assets/37795e14-3354-4db8-a29c-a6792b8a61e7" />



    🗂 Project Structure


    microservices-project/
    
├── netflix-eureka-naming-server       # Service registry
├── netflix-zuul-api-gateway-server    # API Gateway
├── spring-cloud-config-server         # Centralized configuration
├── user-authentication                # Authentication and JWT service
└── user-data                           # User data CRUD service



⚙️ Technologies Used

Spring Boot – Microservice development
Spring Cloud Eureka – Service discovery
Spring Cloud Config – Centralized configuration
Zuul API Gateway – Request routing and filtering
Spring Security + JWT – Authentication
Spring Data JPA / Hibernate – Database access


💡 Key Features

Dynamic Service Discovery – No hardcoding of service URLs, Eureka manages service registry.

Centralized Configurations – All microservices load configs from Config Server.

Secure API Gateway – JWT authentication ensures only authorized requests pass.

Resilient Microservices – Independent services with their own databases.

Scalable Architecture – Microservices can scale independently.
MySQL / PostgreSQL – Database
Maven – Build and dependency management
