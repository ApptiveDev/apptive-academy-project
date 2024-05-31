package com.backend.apptive.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/api/user")
    public Optional<User> getUser(@RequestParam String name, @RequestParam String phoneNumber) {
        return userService.findUserByNameAndPhoneNumber(name, phoneNumber);
    }
}
