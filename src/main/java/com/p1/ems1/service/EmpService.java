package com.p1.ems1.service;

import com.p1.ems1.entity.Employeee;

import java.util.List;

public interface EmpService {
    public String create(Employeee emp);
    public List<Employeee> getAll();
    public List<Employeee>findById(int id);
    public String Update(int id,Employeee emp);
    public  String delete(int id);
}
