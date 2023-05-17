package com.example.ocr.ocr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/test")
    public String testDatabaseConnection() {
        try {
            List<String> result = jdbcTemplate.queryForList("SELECT version()", String.class);
            return "Database connection successful. PostgreSQL version: " + result.get(0);
        } catch (Exception e) {
            return "Failed to connect to the database. Error: " + e.getMessage();
        }
    }
}
