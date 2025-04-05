package com.example.kalyan.Controller;

import com.example.kalyan.dao.Studentdao;
import com.example.kalyan.model.Student;
import com.example.kalyan.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    Studentdao studentdao;

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/getStudents")
    public List<Student> getAllStudents() {
        return studentdao.getStudents();
    }

    //To find with Student ID
    @GetMapping("/getStudentId")
    public Optional<Student> getStdid(@RequestParam long id) {
        return studentdao.getById(id);
    }

    @PostMapping("/saveStudent")
    public String insertStudent(@RequestBody Student student) {
        studentdao.saveStudent(student);
        return "Student inserted succussfully";
    }

    @GetMapping("/getCity")
    public List<Student> getStdCity(@RequestParam String city) {

        return studentdao.getByName(city);
    }

}
