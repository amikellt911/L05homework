package com.example.studentiocaop.controller;

import com.example.studentiocaop.model.Student;
import com.example.studentiocaop.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestParam int sid, @RequestParam String name, @RequestParam String tele) {
        studentService.addStudent(new Student(sid, name, tele));
        return "Student added successfully";
    }

    @DeleteMapping("/delete/{sid}")
    public String deleteStudent(@PathVariable int sid) {
        studentService.deleteStudent(sid);
        return "Student deleted successfully";
    }

    @PutMapping("/modify/{sid}")
    public String modifyStudent(@PathVariable int sid, @RequestParam String name, @RequestParam String tele) {
        studentService.modifyStudent(sid, name, tele);
        return "Student modified successfully";
    }

    @GetMapping("/get/{sid}")
    public Student getStudent(@PathVariable int sid) {
        return studentService.getStudent(sid);
    }
}
