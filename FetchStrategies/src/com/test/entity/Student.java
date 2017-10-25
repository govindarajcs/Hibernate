package com.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {

    @Id
    Integer id;
    String name;
    Integer age;
    String bloodGroup;
    Integer pucScore;
    Float aggregate;
    @ManyToOne
    @JoinColumn(name="dep_id")
    Department department;
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
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getBloodGroup() {
        return bloodGroup;
    }
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    public Integer getPucScore() {
        return pucScore;
    }
    public void setPucScore(Integer pucScore) {
        this.pucScore = pucScore;
    }
    public Float getAggregate() {
        return aggregate;
    }
    public void setAggregate(Float aggregate) {
        this.aggregate = aggregate;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
}
