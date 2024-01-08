package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController

@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    @PostMapping("/create")
    public User create(@RequestBody UserRequest userRequest) {
        System.out.println(userRequest);
        User user = new User();
        user.setUserName(userRequest.getUser().getUserName());
        user.setFirstName(userRequest.getUser().getFirstName());
        user.setLastName(userRequest.getUser().getLastName());
        Company company=userRequest.getUser().getCompany();

        user.setCompany(company);


        userRepository.save(user);
        return user;

    }
}
