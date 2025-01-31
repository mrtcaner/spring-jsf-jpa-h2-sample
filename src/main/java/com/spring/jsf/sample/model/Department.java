package com.spring.jsf.sample.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Department {

       @Id
       @GeneratedValue
       private Long id;

       private String name;

       @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
       private List<Employee> employees = new ArrayList<>();

       public Long getId() {
             return id;
       }

       public void setId(Long id) {
             this.id = id;
       }

       public String getName() {
             return name;
       }

       public void setName(String name) {
             this.name = name;
       }

       public List<Employee> getEmployees() {
             return employees;
       }

       public void setEmployees(List<Employee> employees) {
             this.employees = employees;
       }

}