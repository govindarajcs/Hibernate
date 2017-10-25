package com.test.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.entity.Address;
import com.test.entity.Employee;

public class HibernateMain {

    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("com/test/hibernate/config/config.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Employee emp = new Employee();
        emp.setDescription("Test Clob");
        
        emp.setExampleTest(new Byte((byte)1));
        emp.setId(1);
        emp.setName("Raj");
        Address homeAddr = new Address();
        homeAddr.setArea("Gugai");
        homeAddr.setCity("Salem");
        homeAddr.setDoorNo("1");
        homeAddr.setPincode("636006");
        homeAddr.setStreet("xxx");
        homeAddr.setState("Tamil Nadu");
        Address offAddr = new Address();
        offAddr.setArea("Ecity");
        offAddr.setCity("Bangalore");
        offAddr.setDoorNo("1");
        offAddr.setPincode("560100");
        offAddr.setState("Karnataka");
        offAddr.setStreet("yyy");
        emp.setHomeAddress(homeAddr);
        emp.setOfficeAddress(offAddr);
        session.beginTransaction();
        session.persist(emp);
        session.getTransaction().commit();
        session.close();
    }

}
