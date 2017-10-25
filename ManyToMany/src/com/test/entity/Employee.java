package com.test.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

    @Id
    Integer empId;
    
    @Column
    String name;
    
    @ManyToMany
    @JoinTable(name="EmpDep",joinColumns=@JoinColumn(name="epId",referencedColumnName="empId"),inverseJoinColumns=@JoinColumn(name="dpId",referencedColumnName="depId"))
    List<Department> depList = new ArrayList<Department>();

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepList() {
        return depList;
    }
}