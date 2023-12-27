package com.example.springdbjpa.service;

import com.example.springdbjpa.entty.Student;
import com.example.springdbjpa.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllstudents() {
        return studentRepository.findAll();

    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }


    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);

    }

    public Student updateStudent(Integer id, Student student) {
        Optional<Student> foundStudent = studentRepository.findById(id);

        if (foundStudent.isPresent()) {
            Student newstudent = foundStudent.get();

            newstudent.setName(student.getName());
            newstudent.setSurname(student.getSurname());
            newstudent.setDateOfBirth(student.getDateOfBirth());
            newstudent.setStudentNumber(student.getStudentNumber());

            return studentRepository.save(newstudent);
        }
        return null;
    }


}