package com.p1.ems1.service;

import com.p1.ems1.entity.Employee;
import com.p1.ems1.exception.ResourceNotFound;
import com.p1.ems1.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpServiceImpl implements EmpService{
    @Autowired
    private EmpRepo empRepo;

    @Override
    public Employee save(Employee emp) {
        return empRepo.save(emp);
    }

    @Override
    public List<Employee> getAllEmp() {
        return empRepo.findAll();
    }

    @Override
    public Employee getById(long id) {
        /*
        Optional<Employee> empp=empRepo.findById(id);
        if(empp.isPresent()){
            return empp.get();
        }else{
            throw new ResourceNotFound("Employee","id",id);
        }*/
        return empRepo.findById(id).orElseThrow(()->
                new ResourceNotFound("Employee","id",id));
    }

    @Override
    public Employee update(Employee emp, long id) throws ResourceNotFound {
        Employee existingEmp=empRepo.findById(id).orElseThrow(()->
         new ResourceNotFound("Employee","id",id));
        existingEmp.setFirstName(emp.getFirstName());
        existingEmp.setLastName(emp.getLastName());
        existingEmp.setAge(emp.getAge());
        empRepo.save(existingEmp);
        return existingEmp;
    }

    @Override
    public String delete(long id) {
        empRepo.findById(id).orElseThrow(()->
                new ResourceNotFound("Employee","id",id));
        empRepo.deleteById(id);
        return "Deleted sucessfully";
    }
}
