package com.test.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.entity.Department;
import com.test.entity.Employee;

public class ManyToOneExample {

    public static void main(String[] args) {
       Configuration cfg = new Configuration().configure("com/hibernate/config/config.cfg.xml");
       SessionFactory factory = cfg.buildSessionFactory();
       Session session = factory.openSession();
       Employee emp = new Employee();
       emp.setEmpId(1);
       emp.setName("Raj");
       Department dep = new Department();
       dep.setDepId(2);
       dep.setName("IT");
       emp.getDepList().add(dep);
       dep.getEmpList().add(emp);
       session.beginTransaction();
       session.persist(dep);
       session.persist(emp);
       session.getTransaction().commit();
       session.close();
    }
}