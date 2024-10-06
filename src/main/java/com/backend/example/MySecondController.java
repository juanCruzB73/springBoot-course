package com.backend.example;

import com.backend.example.exampleApiRest.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MySecondController {

    private final StudentRepository studentRepository;

    public MySecondController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //get method to all students
    @GetMapping("/students")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Student> findAllStudents(){
        return studentRepository.findAll();
    }
    //FIND BY ID
    @GetMapping("/students/{id}")
    public Student studentById(@PathVariable("id") Integer id){
        return studentRepository.findById(id).orElse(new Student());
    }
    //SEARCH BY NAME
    @GetMapping("/students/search/{name}")
    public List<Student> studentByName(@PathVariable("name") String name){
        return studentRepository.findAllByNameContaining(name);
    }
    //post method
    @PostMapping("/student")
    public Student post(@RequestBody Student student){//converts the body from the http request into the java object needed
        return studentRepository.save(student);
    }
    //deleateById
    @DeleteMapping("/students/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudent(@PathVariable("id")Integer id){
        studentRepository.deleteById(id);
    }




}
