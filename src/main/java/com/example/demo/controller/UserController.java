package com.example.demo.controller;

import com.example.demo.model.Company;
import com.example.demo.model.Owner;
import com.example.demo.model.User;
import com.example.demo.repository.CompanyRepository;
import com.example.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController

@RequestMapping("/test")
public class UserController {
    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") Long id) {
        User user = new User();
        Optional<User> userOpt = userRepository.findById(id);
        if (userOpt.isPresent()) {
            user = userOpt.get();
        }

        System.out.println(user);

        return user;
    }

    @GetMapping("/getCom/{id}")
    public Company getCom(@PathVariable("id") Long id) {
        Company company = new Company();
        Optional<Company> comOpt = companyRepository.findById(id);
        if (comOpt.isPresent()) {
            company = comOpt.get();
        }

       // System.out.println(company);

        return null;
    }

    @PostMapping("/saves")
    public void save(@RequestBody User user) {
        companyRepository.save(user.getCompany());
        System.out.println(user.getCompany());
        userRepository.save(user);
        System.out.println(user);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        userRepository.deleteById(id);
      //companyRepository.deleteById(id);

    }

    @GetMapping("/all")
    public List<Company> all() {
        List<Company>list=companyRepository.findAll();

        return list;
    }
}
