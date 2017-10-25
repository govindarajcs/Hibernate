package com.test.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.entity.Department;
import com.test.entity.Employee;

public class ManyToOneExample1 {

    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("com/hibernate/config/config.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Employee emp = new Employee();
        emp.setAge(12);
        emp.setEmpId(1);
        emp.setName("RAJ");
        Department dep = new Department();
        dep.setDescription("YYYY");
        dep.setId(1);
        dep.setName("IT");
        dep.getEmployeeList().add(emp);
        emp.setDepartment(dep);
        session.beginTransaction();
        session.save(emp);
        session.getTransaction().commit();
        session.close();
        
        session = factory.openSession();
        session.beginTransaction();
        Employee emp1 =  session.load(Employee.class, 1);
       // emp1.setAge(22);
        emp1.getAge();
        session.update(emp1);
        session.getTransaction().commit();
        session.close();
        System.out.println(emp1.getDepartment().getName());
    }

}
