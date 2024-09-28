package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/db")
public class DatabaseCheckController {
    // @Autowired
    // private JdbcTemplate jdbcTemplate;

    // @GetMapping("/check")
    // public String checkDatabaseConnection() {
    //     try {
    //         jdbcTemplate.execute("SELECT 1");
    //         return "Successfully connected to MySQL!";
    //     } catch (Exception e) {
    //         return "Failed to connect to MySQL: " + e.getMessage();
    //     }
    // }
}
