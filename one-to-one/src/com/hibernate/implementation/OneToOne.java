package com.hibernate.implementation;

import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Address;
import com.hibernate.entity.Employee;
import com.hibernate.entity.Gender;

public class OneToOne {
    
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("com/hibernate/config/config.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Employee emp = new Employee();
        emp.setName("Raj");
        emp.setSalary(10000f);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE, 25);
        cal.set(Calendar.MONTH, 12);
        cal.set(Calendar.YEAR, 1988);
        emp.setDateOfBirth(cal.getTime());
        emp.setGender(Gender.MALE);
        Address address = new Address();
        address.setCity("Salem");
        address.setDoorNo(37);
        address.setLandmark("Sangeeth Theatre");
        address.setState("TamilNadu");
        address.setPincode(636006);
        address.setStreetName("Pulikuthi Street:3");
        address.setEmployee(emp);
        emp.setAddress(address);
        Session session = factory.openSession();
        session.beginTransaction();
        //session.persist(emp);
        session.persist(address);
        session.getTransaction().commit();
        session.close();
        
       /* session = factory.openSession();
        session.beginTransaction();
        session.delete(address);
        session.getTransaction().commit();
        session.close();*/
    }
}