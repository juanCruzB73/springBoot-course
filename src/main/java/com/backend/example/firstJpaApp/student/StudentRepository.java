package com.backend.example.firstJpaApp.student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    List<Student> findAllByNameContaining(String name);

}
