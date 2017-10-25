package com.test.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;

@Entity
public class Employee {
    
    @Id
   // @GeneratedValue(strategy=GenerationType.AUTO)
    @Basic(fetch=FetchType.LAZY)
    Integer empId;
    
    @Basic(fetch=FetchType.LAZY,optional=false)
    String name;
    @Basic(fetch=FetchType.LAZY)
    Integer age;
    @Basic(fetch=FetchType.EAGER)
    Float salary;
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
