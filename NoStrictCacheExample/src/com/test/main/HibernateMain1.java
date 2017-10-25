package com.test.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.entity.Employee;

public class HibernateMain1 {

    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("com/test/config/config.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Employee emp1 = new Employee();
        Session session = factory.openSession();
        session.beginTransaction();
        emp1.setId(2);
        emp1.setAge(28);
        emp1.setName("Govind");
        emp1.setSalary(5000.0);
        session.persist(emp1);
        session.getTransaction().commit();
        session.close();
    }
}