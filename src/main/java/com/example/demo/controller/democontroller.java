package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class democontroller {

    @GetMapping("/home")
    public String greet() {
        return "hey buddy";
    }

    @GetMapping("/employee")
        public List<List<String>> getEmployeeDetails() {
            // Create an empty list of employees
            List<List<String>> employees = new ArrayList<>();

            // Add employee details to the list
            List<String> employee1 = new ArrayList<>();
            employee1.add("1");
            employee1.add("John Doe");
            employee1.add("Developer");
            employees.add(employee1);

            List<String> employee2 = new ArrayList<>();
            employee2.add("2");
            employee2.add("Alice Smith");
            employee2.add("Manager");
            employees.add(employee2);

            List<String> employee3 = new ArrayList<>();
            employee3.add("3");
            employee3.add("Bob Johnson");
            employee3.add("Designer");
            employees.add(employee3);

            // Return the list of employees
            return employees;
        }
    
}
