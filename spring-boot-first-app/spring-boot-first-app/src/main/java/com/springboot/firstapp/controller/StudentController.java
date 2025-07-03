package com.springboot.firstapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.springboot.firstapp.bean.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class StudentController {

    // http://localhost:8080/student

    // return single bean as json format
    @GetMapping("/student")
    public Student getStudent(){
        Student student=new Student(1,"sneha","latha");
        return student;
    }

    // return list in json format
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students=new ArrayList<>();
        students.add(new Student(1,"sneha","latha"));
        students.add(new Student(1,"vattam","vishal"));
        return students;
    }
    
}
