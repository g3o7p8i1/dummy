package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class democontroller {
      @GetMapping("/home")
    	  public String greet() {
    		  return "hey buddy";
    	  }
      
}
