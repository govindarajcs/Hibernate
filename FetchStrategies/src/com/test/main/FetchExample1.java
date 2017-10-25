package com.test.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.entity.Employee;

/*
 * Check fetch strategy eager and lazy...
 */
public class FetchExample1 {

    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("com/hibernate/config/config.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Employee emp = new Employee();
        emp.setAge(12);
        emp.setEmpId(1);
       // emp.setName("Raj");
        emp.setSalary(10000f);
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(emp);
        session.getTransaction().commit();
        session.close();
        Employee emp1 = null;
        session = factory.openSession();
        session.beginTransaction();
        emp1 = session.load(Employee.class, 1);
        session.getTransaction().commit();
        session.close();
        System.out.println(emp1);
    }
}