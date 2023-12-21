# RESTfulCRUD Project

This project is a RESTful CRUD (Create, Read, Update, Delete) API built with Spring Boot and connected to a SQL database.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine.

### Prerequisites

- Java 8 or higher
- Maven
- MYSQL 

### Installation

1. Clone the repository.
2. Run the `mvn install` command.
3. Run the `java -jar target/myapp-0.0.1-SNAPSHOT.jar` command.

## Usage

You can send the following HTTP requests using Postman:

- `GET /api/resource`: Lists all resources.
- `POST /api/resource`: Creates a new resource.
- `PUT /api/resource/{id}`: Updates an existing resource.
- `DELETE /api/resource/{id}`: Deletes an existing resource.
  
