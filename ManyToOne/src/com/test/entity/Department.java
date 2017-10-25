package com.test.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert(true)
@DynamicUpdate(value=true)
public class Department {
    
    @Id
  // @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column
    Integer id;
    @Column
    String name;
    
    @OneToMany(fetch=FetchType.LAZY,mappedBy="department",cascade=CascadeType.ALL)
   // @JoinTable(name="Dep_Emp",joinColumns=@JoinColumn(name="depId",referencedColumnName="id"),inverseJoinColumns=@JoinColumn(name="empId",referencedColumnName="empId"))
    List<Employee> employeeList = new ArrayList<Employee>();

    String description;
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
