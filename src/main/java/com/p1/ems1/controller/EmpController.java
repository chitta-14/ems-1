package com.p1.ems1.controller;

import com.p1.ems1.entity.Employee;
import com.p1.ems1.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
@CrossOrigin("*")
public class EmpController {
    @Autowired
    private EmpService empService;

    @PostMapping()
    public ResponseEntity<Employee> save(@RequestBody Employee emp){
        return new ResponseEntity<Employee>(empService.save(emp), HttpStatus.CREATED);
    }
    @GetMapping()
    public ResponseEntity<List<Employee>> getAllEmp(){
        return new ResponseEntity<List<Employee>>(empService.getAllEmp(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getById(@PathVariable("id")long id){
        return new ResponseEntity<Employee>(empService.getById(id),HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Employee> update(@RequestBody Employee emp,@PathVariable("id") long id){
        return new ResponseEntity<Employee>(empService.update(emp,id),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id")long id){
        return new ResponseEntity<String>(empService.delete(id),HttpStatus.OK);
    }
}
