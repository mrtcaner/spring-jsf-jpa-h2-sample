package com.spring.jsf.sample.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

       @Id
       @GeneratedValue
       private Long id;

       private String name;

       @ManyToOne(fetch = FetchType.LAZY)
       private Department department;

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

       public Department getDepartment() {
             return department;
       }

       public void setDepartment(Department department) {
             this.department = department;
       }

}