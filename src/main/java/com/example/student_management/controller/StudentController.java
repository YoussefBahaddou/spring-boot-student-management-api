package com.example.student_management.controller;

import com.example.student_management.entity.Student;
import com.example.student_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("students")
// @Tag(name = "Student Management", description = "API for managing students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // @Operation(summary = "Create or update a student", description = "Creates a new student or updates an existing one")
    // @ApiResponses(value = {
    //     @ApiResponse(responseCode = "201", description = "Student created successfully"),
    //     @ApiResponse(responseCode = "400", description = "Invalid input")
    // })
    @PostMapping("/save")
    public ResponseEntity<Student> save(@RequestBody Student student) {
        Student savedStudent = studentService.save(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    // @Operation(summary = "Delete a student", description = "Deletes a student by their ID")
    // @ApiResponses(value = {
    //     @ApiResponse(responseCode = "204", description = "Student deleted successfully"),
    //     @ApiResponse(responseCode = "404", description = "Student not found")
    // })
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        boolean deleted = studentService.delete(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // @Operation(summary = "Get all students", description = "Returns a list of all students")
    // @ApiResponse(responseCode = "200", description = "Successfully retrieved the list of students")
    @GetMapping("/all")
    public ResponseEntity<List<Student>> findAll() {
        List<Student> students = studentService.findAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    // @Operation(summary = "Count students", description = "Returns the total number of students")
    // @ApiResponse(responseCode = "200", description = "Successfully retrieved the count")
    @GetMapping("/count")
    public ResponseEntity<Long> countStudent() {
        long count = studentService.countStudents();
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    // @Operation(summary = "Get students by birth year", description = "Returns the number of students grouped by birth year")
    // @ApiResponse(responseCode = "200", description = "Successfully retrieved the statistics")
    @GetMapping("/byYear")
    public ResponseEntity<Collection<?>> findByYear() {
        Collection<?> studentsByYear = studentService.findNbrStudentByYear();
        return new ResponseEntity<>(studentsByYear, HttpStatus.OK);
    }
}
