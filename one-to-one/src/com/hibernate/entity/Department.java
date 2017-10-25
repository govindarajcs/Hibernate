package com.hibernate.entity;

import java.util.List;

public class Department {

    Integer id;
    String name;
    List<Employee> employeeList;
    Address address;
    Employee HOD;
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
    public Employee getHOD() {
        return HOD;
    }
    public void setHOD(Employee hOD) {
        HOD = hOD;
    }
    public Department(Integer id, String name, List<Employee> employeeList, Employee hOD) {
        super();
        this.id = id;
        this.name = name;
        this.employeeList = employeeList;
        HOD = hOD;
    }
    public Department() {
        super();
    }
}