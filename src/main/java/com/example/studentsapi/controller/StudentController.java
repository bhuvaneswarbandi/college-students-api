package com.example.studentsapi.controller;

import com.example.studentsapi.model.Student;
import com.example.studentsapi.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Add a single student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    // Add multiple students
    @PostMapping("/batch")
    public List<Student> addStudents(@RequestBody List<Student> students) {
        return studentService.saveStudents(students);
    }

    // Get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // Get a student by ID
    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }
}
