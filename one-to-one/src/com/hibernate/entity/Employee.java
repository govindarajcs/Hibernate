package com.hibernate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    Integer id;
    @Column
    String name;
    @Column
    Float salary;
    @Column
    @Temporal(TemporalType.DATE)
    Date dateOfBirth;
    @Column
    Gender gender;
    @OneToOne(fetch=FetchType.LAZY)
    Address address;
    
    public Employee() {
        super();
    }
    public Employee(Integer id, String name, Float salary, Date dateOfBirth, Gender gender,Address address) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
     //   this.department = department;
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
    public Float getSalary() {
        return salary;
    }
    public void setSalary(Float salary) {
        this.salary = salary;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
}