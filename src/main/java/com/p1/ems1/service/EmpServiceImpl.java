package com.p1.ems1.service;

import com.p1.ems1.entity.Employeee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

   @Autowired
    private EmpRepository empRepo;
    @Override
    public String create(Employeee emp) {
        empRepo.save(emp);
        return "sucessfully save";
    }

    @Override
    public List<Employeee> getAll() {
        return null;
    }

    @Override
    public List<Employeee> findById(int id) {
        return null;
    }

    @Override
    public String Update(int id, Employeee emp) {
        return null;
    }

    @Override
    public String delete(int id) {
        return null;
    }
}
