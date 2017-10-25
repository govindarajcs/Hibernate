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
public class Department {

    @Id
    Integer depId;
    @Column
    String name;
    
    @ManyToMany
    @JoinTable(name="EmpDep",inverseJoinColumns=@JoinColumn(name="epId",referencedColumnName="empId"),joinColumns=@JoinColumn(name="dpId",referencedColumnName="depId"))
    List<Employee> empList = new ArrayList<Employee>();

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

}
