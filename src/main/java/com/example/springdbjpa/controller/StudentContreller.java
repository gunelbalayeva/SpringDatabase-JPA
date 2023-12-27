package com.example.springdbjpa.controller;

import com.example.springdbjpa.entty.Student;
import com.example.springdbjpa.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentContreller {
    private final StudentService studentService;


    public StudentContreller(StudentService service) {
        this.studentService = service;
    }

    @GetMapping("/all")
    public List<Student> getAllstudents() {
        return studentService.getAllstudents();
    }

    @PostMapping("/new")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);

    }

    @DeleteMapping("/delete{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentService.deleteStudent(id);
    }

    @PutMapping("/students/edit{id}")
    public Student updateStudent(@PathVariable Integer id, @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }
}
