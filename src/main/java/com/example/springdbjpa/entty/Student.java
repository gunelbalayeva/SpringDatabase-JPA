package com.example.springdbjpa.entty;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "date_of_birth", nullable = false)
    private Integer dateOfBirth;  // corrected variable name

    @Column(name = "student_number", nullable = false,unique = true)
    private String studentNumber;  // corrected variable name

}
