package com.example.kalyan.dao;


import com.example.kalyan.model.Student;
import com.example.kalyan.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Studentdao {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
    //To find with Student ID

    public Optional<Student> getById(long id) {
        return studentRepository.findById(id);
    }
    @Cacheable(cacheNames="byCity")
    public List<Student> getByName(String city) {
        return studentRepository.findByCity(city);
    }

    @CacheEvict(cacheNames="byCity", allEntries=true)
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }
}
