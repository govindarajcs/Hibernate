package com.test.task;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.entity.Employee;
import com.test.util.HibernateUtils;

public class Task2 extends Thread {
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
        
        SessionFactory factory = HibernateUtils.getSessionFactory();
        Employee emp1 = null;
        Session session = factory.openSession();
        session.beginTransaction();
        emp1 = (Employee) session.get(Employee.class, 1);
        System.out.println("In thread 2");
        System.out.println(emp1.getName()+" --- "+emp1.getSalary());
        emp1.setSalary(400.0);
        session.getTransaction().commit();
        session.close();
    }

}
