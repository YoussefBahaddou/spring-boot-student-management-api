# Student Management API

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.7-brightgreen)
![Java](https://img.shields.io/badge/Java-21-orange)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![Swagger](https://img.shields.io/badge/Swagger-2.0.2-green)

A comprehensive Spring Boot application that provides a RESTful API for managing student data. This project demonstrates the implementation of a complete backend system with CRUD operations, custom queries, and statistical data retrieval.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Database Setup](#database-setup)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [API Documentation](#api-documentation)
  - [Swagger UI](#swagger-ui)
  - [API Endpoints](#api-endpoints)
- [Testing](#testing)
  - [Automated Tests](#automated-tests)
  - [Manual Testing with Postman](#manual-testing-with-postman)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## Overview

The Student Management API is designed to manage student records in an educational institution. It allows administrators to create, retrieve, and delete student records, as well as obtain statistical information about the student population.

## Features

- Create and update student records
- Retrieve individual or all student records
- Delete student records
- Count the total number of students
- Get statistics on students grouped by birth year
- Comprehensive API documentation with Swagger
- Unit tests for all endpoints

## Technologies Used

- **Java 21**: Core programming language
- **Spring Boot 3.5.7**: Application framework
- **Spring Data JPA**: Data access and ORM
- **Spring MVC**: Web layer and REST API
- **Hibernate**: ORM implementation
- **MySQL**: Database
- **Swagger/OpenAPI 2.0.2**: API documentation
- **JUnit 5**: Testing framework
- **Mockito**: Mocking framework for testing
- **Maven**: Build and dependency management

## Prerequisites

Before running the application, ensure you have the following installed:

- Java Development Kit (JDK) 21 or later
- Maven 3.6 or later
- MySQL 8.0 or later
- An IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

## Database Setup

1. Create a MySQL database named `studentdb`:
   ```sql
   CREATE DATABASE studentdb;
   ```

2. The application is configured to use:
   - Host: localhost
   - Port: 3307 (Note: This is different from the default MySQL port 3306)
   - Username: root
   - Password: (empty)

3. If your MySQL configuration is different, update the `application.properties` file accordingly.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/student-management.git
   cd student-management
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

## Running the Application

To run the application, use the following command:

```bash
mvn spring-boot:run
```

The application will start on port 8082 by default. You can access it at:
```
http://localhost:8082
```

## API Documentation

### Swagger UI

This application integrates Swagger UI for API documentation and testing. Once the application is running, you can access the Swagger UI at:

```
http://localhost:8082/swagger-ui.html
```

The Swagger UI provides a user-friendly interface to:

1. View all available endpoints
2. Read the documentation for each endpoint
3. Test the endpoints directly from the browser
4. See the expected request and response formats

### API Endpoints

The following endpoints are available:

| Method | Endpoint | Description | Response Codes |
|--------|----------|-------------|---------------|
| POST | `/students/save` | Create or update a student | 201 Created |
| DELETE | `/students/delete/{id}` | Delete a student by ID | 204 No Content, 404 Not Found |
| GET | `/students/all` | Get all students | 200 OK |
| GET | `/students/count` | Get the total count of students | 200 OK |
| GET | `/students/byYear` | Get statistics on students grouped by birth year | 200 OK |

## Testing

### Automated Tests

The project includes unit tests for the controller layer. To run the tests:

```bash
mvn test
```

The tests use Mockito to mock the service layer, ensuring that the controller behavior is tested in isolation.

### Manual Testing with Postman

You can also test the API using Postman:

1. **Create a student**:
   - Method: POST
   - URL: http://localhost:8082/students/save
   - Body (JSON):
     ```json
     {
       "nom": "LACHGAR",
       "prenom": "Mohamed",
       "dateNaissance": "1985-09-01"
     }
     ```
   - Expected response: 201 Created

2. **Get all students**:
   - Method: GET
   - URL: http://localhost:8082/students/all
   - Expected response: 200 OK

3. **Delete a student**:
   - Method: DELETE
   - URL: http://localhost:8082/students/delete/{id} (replace {id} with the actual ID)
   - Expected response: 204 No Content (if successful) or 404 Not Found (if the student doesn't exist)

4. **Count students**:
   - Method: GET
   - URL: http://localhost:8082/students/count
   - Expected response: 200 OK

5. **Get students by birth year**:
   - Method: GET
   - URL: http://localhost:8082/students/byYear
   - Expected response: 200 OK

## Project Structure

The project follows a standard Spring Boot architecture:

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── student_management/
│   │               ├── controller/       # REST controllers
│   │               ├── entity/           # JPA entities
│   │               ├── repository/       # Data access layer
│   │               ├── service/          # Business logic
│   │               ├── config/           # Configuration classes
│   │               └── StudentManagementApplication.java
│   └── resources/
│       └── application.properties        # Application configuration
└── test/
    └── java/
        └── com/
            └── example/
                └── student_management/
                    └── StudentControllerTest.java  # Controller tests
```

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing fea<img width="2005" height="1022" alt="Screenshot 2025-10-24 012446" src="https://github.com/user-attachments/assets/7c1ca65c-0bed-4180-b5b2-8fb721c2085b" />
ture'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request


<img width="502" height="442" alt="Screenshot 2025-10-24 013306" src="https://github.com/user-attachments/assets/10125ee9-9416-44a0-9b28-08d8d51b8a44" />
<img width="2080" height="992" alt="Screenshot 2025-10-24 012830" src="https://github.com/user-attachments/assets/7e8d7f03-cf7e-495f-b1cf-1eb1949f696d" />
<img width="2082" height="895" alt="Screenshot 2025-10-24 012648" src="https://github.com/user-attachments/assets/c2df7a9b-f3f6-436b-a153-0c12afe9eaa6" />
<img width="2045" height="1088" alt="Screenshot 2025-10-24 012559" src="https://github.com/user-attachments/assets/415d924e-c068-4a80-8265-ad33363a7fb7" />



