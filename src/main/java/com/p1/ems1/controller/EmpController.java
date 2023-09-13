package com.p1.ems1.controller;

import com.p1.ems1.entity.Employeee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RequestMapping("/emp")
@RestController
public class EmpController {

    @Autowired
    private EmpService empService;
    @PostMapping()
    public String create(Employeee emp){
         empService.create(emp);
    }
}
