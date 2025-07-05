package com.springboot.firstapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.springboot.firstapp.bean.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;



@RestController
// @RequestMapping("/student") if we use this we can remove student from all the below URLS
public class StudentController {

    // http://localhost:8080/student

    // return single bean as json format
    @GetMapping("/student")
    public Student getStudent(){
        Student student=new Student(1,"sneha","latha");
        return student;
    }

    // return list in json format
    @GetMapping("/student/list")
    public List<Student> getStudents() {
        List<Student> students=new ArrayList<>();
        students.add(new Student(1,"sneha","latha"));
        students.add(new Student(1,"vattam","vishal"));
        return students;
    }

    // path variable
    //what ever variables we use inside uri those should be given inside the method also
    // we use @PathVariable annotation to define that the variable is a path varaiable
    // we can also use other varaible name like studentId but we have to give it like this @PathVariable("id") int studentId
    // http://localhost:8080/student/10
    @GetMapping("/student/{id}")
    public Student studentPathVariable(@PathVariable int id){
        return new Student(id, "sneha","latha");
    }

    // Request Parameters
    // http://localhost:8080/student/query?id=10&firstName=snhea&lastName=latha
    @GetMapping("/student/query")
    public Student studentRequestParam(@RequestParam int id,@RequestParam String firstName,@RequestParam String lastName){
        return new Student(id, firstName, lastName);
    }

    // spring boot rest api that handles HTTP POST request
    // @PostMapping and @RequestBody

    @PostMapping("/student/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student studentCreate(@RequestBody Student student){
        System.out.println(student.getId()+" "+student.getFirstName()+" "+student.getLastName());
        return student;
    }

    // PutMapping and RequestMapping
    @PutMapping("/student/update/{lastName}")
    public Student studentUpdate(@RequestBody Student student, @PathVariable String lastName){
        student.setLastName(lastName);
        return student;
    }

    @DeleteMapping("/student/delete/{id}")
    public String studentDelete(@PathVariable int id){
        return "Student with "+id+" removed";
    }

    // response entity

    @GetMapping("/student/response-entity")
    public ResponseEntity<Student> getStudentResponseEntity(){
        Student student=new Student(1,"sneha","latha");
        // return new ResponseEntity<>(student,HttpStatus.OK);
        // return ResponseEntity.ok(student);
        return ResponseEntity.ok().header("custom-header", "sneha").body(student);
    }
    
}
