package com.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert(value=true)
@DynamicUpdate(false)
public class Employee {
    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    Integer empId;
    @Column
    String name;
    @Column
    Integer age;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="depId")    
    Department department;
    
    public Integer getEmpId() {
        return empId;
    }
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    
}
