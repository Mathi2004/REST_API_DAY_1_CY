package com.example.demo.Controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.College;

@RestController
public class ApiController_2 {
    @GetMapping("/college")
    public List<College> getCollege()
    {
    	return Arrays.asList(new College("SKCET","ECE",4));
    }
}
