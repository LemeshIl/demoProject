package com.example.demo.controller;

import com.example.demo.model.DTOStudents;
import com.example.demo.service.StudentService;
import com.example.demo.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/test")
public class TestController {
    private final StudentService studentService;

    @PostMapping("/create")
    public Student createOrUpdateStudent(@RequestBody DTOStudents dto) {
        return studentService.createOrUpdateStudent(dto);
    }
}
