package com.spring.jsf.sample.dao;

import com.spring.jsf.sample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeDao extends JpaRepository<Employee, Long> {

}