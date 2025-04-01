package com.example.kalyan.service;


import com.example.kalyan.dao.Studentdao;
import com.example.kalyan.model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    Studentdao studentdao=new Studentdao();

    public Optional<Student> getName(long id){
        return studentdao.getById(id);

    }

    public List<Student> getByName(@RequestParam String city){
        return studentdao.getByName(city);
    }




}
