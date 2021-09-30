package com.agb1986.users.controllers;

import com.agb1986.users.config.UsersConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @Autowired
    private UsersConfig config;

    @GetMapping(path = "/users")
    public ResponseEntity<Object> getUsers() {
        return new ResponseEntity<>(config.getMaximum(), HttpStatus.OK);
    }
}
