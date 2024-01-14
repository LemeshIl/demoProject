package com.example.demo.repository;

import com.example.demo.model.Company;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Long> {


   // @EntityGraph(type = EntityGraph.EntityGraphType.FETCH, attributePaths = "users")//n+1
    List<Company> findAll();
}
