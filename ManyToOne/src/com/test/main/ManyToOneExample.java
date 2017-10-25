package com.test.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.entity.Department;
import com.test.entity.Employee;

public class ManyToOneExample {

    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("com/hibernate/config/config.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Department dep1 = new Department();
        dep1.setName("ECE");
        dep1.setId(3);
        dep1.setDescription("XXXXXX");
        Employee emp2 = new Employee();
        emp2.setAge(28);
        emp2.setEmpId(16);
        emp2.setDepartment(dep1);
        emp2.setName("Shankar");
        if(dep1.getEmployeeList()==null){
            dep1.setEmployeeList(new ArrayList<Employee>());
        }
        dep1.getEmployeeList().add(emp2);
        Session session = factory.openSession();
        session.beginTransaction();
        session.persist(dep1);
        //session.persist(emp2);
        session.getTransaction().commit();
        session.close();
        
        Employee emp3 = new Employee();
        emp3.setEmpId(3);
        emp3.setName("Raj");
        emp3.setDepartment(dep1);
        dep1.getEmployeeList().add(emp3);
        session = factory.openSession();
        session.beginTransaction();
        session.update(dep1);
        session.getTransaction().commit();
        session.close();
    }
}