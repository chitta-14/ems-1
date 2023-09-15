package com.p1.ems1.service;

import com.p1.ems1.entity.Employee;
import com.p1.ems1.exception.ResourceNotFound;

import java.util.List;

public interface EmpService {
    public Employee save(Employee emp);
    public List<Employee> getAllEmp();
    public Employee getById(long id);
    public Employee update(Employee emp,long id) ;
    public String delete(long id);

}
