package com.example.demo.service;

import com.example.demo.model.DTOStudents;
import com.example.demo.repository.StudentRepository;
import com.example.demo.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    @Transactional(readOnly = true)
    public Student createOrUpdateStudent(DTOStudents dto) {
        Optional<Student> studentOpt = studentRepository.findByNumber(dto.getNumber());
        if (studentOpt.isPresent()) {
            Student student = studentOpt.get();
            student.setName(dto.getName());
            student.setType(dto.getType());
            studentRepository.save(student);
        } else {
            Student student = new Student();
            student.setNumber(dto.getNumber());
            student.setName(dto.getName());
            student.setType(dto.getType());
//            studentRepository.s(student);
        }
        return getByNumber(dto.getNumber());
    }

    @Transactional
    public Student getByNumber(int number) {
        Student student = new Student();
        Optional<Student> studentOpt = studentRepository.findByNumber(number);
        if (studentOpt.isPresent()) {
            student = studentOpt.get();
        }
        return student;
    }

}
