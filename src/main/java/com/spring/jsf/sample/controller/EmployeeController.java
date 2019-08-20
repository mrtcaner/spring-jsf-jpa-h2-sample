package com.spring.jsf.sample.controller;

import com.spring.jsf.sample.dao.EmployeeDao;
import com.spring.jsf.sample.model.Employee;
import com.spring.jsf.sample.util.ViewScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@ViewScope
public class EmployeeController {

    private List<Employee> employees = new ArrayList<>();

    @Autowired
    private EmployeeDao employeeDao;

    private Employee newEmployee;

    @PostConstruct
    void init(){
        newEmployee = new Employee();
        findAll();
    }


    public void saveNewEmployee(){
        employeeDao.save(newEmployee);
        findAll();
    }

    public void prepareNewEmployee(){
        newEmployee = new Employee();
    }

    public void findAll() {
        employees = employeeDao.findAll();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Employee getNewEmployee() {
        return newEmployee;
    }

    public void setNewEmployee(Employee newEmployee) {
        this.newEmployee = newEmployee;
    }
}