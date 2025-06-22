package com.example.studentsapi.service;

import com.example.studentsapi.model.Student;
import com.example.studentsapi.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    // Save a single student
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    // Save a list of students
    public List<Student> saveStudents(List<Student> students) {
        return repository.saveAll(students);
    }

    // Get all students
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // Get a student by ID
    public Optional<Student> getStudentById(Long id) {
        return repository.findById(id);
    }
}
