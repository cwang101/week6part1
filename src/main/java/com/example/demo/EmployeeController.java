package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {
    List<EmployeeBean> employees;

    public EmployeeController() {
        this.employees = Arrays.asList(new EmployeeBean(0,"小明",20,"男"),
                new EmployeeBean(1,"小红",19,"女"),
                new EmployeeBean(2,"小智",15,"男"),
                new EmployeeBean(3,"小刚",16,"男"),
                new EmployeeBean(4,"小霞",15,"女"));
    }

    @GetMapping("/employees")
    public List<EmployeeBean> retrieve(){
        return employees;
    }
}
