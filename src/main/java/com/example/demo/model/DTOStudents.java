package com.example.demo.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class DTOStudents {
    private String name;
    private int number;
    @Enumerated(EnumType.STRING)
    private Type type;
}
