package com.example.kalyan.repository;


import com.example.kalyan.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByName(String name);

    //To find the Student by Id
    List<Student> findAllById(long i);

    List<Student> findByCity(String city);

}
