# Student Management API

This is a Spring Boot application that provides a REST API for managing students.

## Features

- Create, read, and delete students
- Count the total number of students
- Get statistics on students grouped by birth year

## Swagger UI

This application integrates Swagger UI for API documentation and testing. Once the application is running, you can access the Swagger UI at:

```
http://localhost:8082/swagger-ui.html
```

The Swagger UI provides a user-friendly interface to:

1. View all available endpoints
2. Read the documentation for each endpoint
3. Test the endpoints directly from the browser
4. See the expected request and response formats

## API Endpoints

The following endpoints are available:

- `POST /students/save` - Create or update a student
- `DELETE /students/delete/{id}` - Delete a student by ID
- `GET /students/all` - Get all students
- `GET /students/count` - Get the total count of students
- `GET /students/byYear` - Get statistics on students grouped by birth year

## Running the Application

To run the application, use the following command:

```
mvn spring-boot:run
```

The application will start on port 8082 by default.

## Testing with Postman

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