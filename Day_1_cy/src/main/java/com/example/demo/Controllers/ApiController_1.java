package com.example.demo.Controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Family;

@RestController
public class ApiController_1 {
      @GetMapping("/family")
      public  List<Family> getFamilyDetails()
      {
    	  return Arrays.asList(new Family("Senthamil",98,"grandma"));
      }
}
