package com.agb1986.courses.controllers;

import com.agb1986.courses.config.CoursesConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursesController {
    @Autowired
    private CoursesConfig config;

    @GetMapping(path = "/courses")
    public ResponseEntity<Object> getCourses() {
        return new ResponseEntity<>(config.getMinimum(), HttpStatus.OK);
    }
}
