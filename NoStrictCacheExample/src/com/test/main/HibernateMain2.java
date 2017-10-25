package com.test.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.entity.Employee;
import com.test.task.Task;
import com.test.task.Task2;
import com.test.util.HibernateUtils;

public class HibernateMain2 {

    public static void main(String[] args) throws InterruptedException {
        SessionFactory factory = HibernateUtils.getSessionFactory();
        Employee emp1 = null;
        Session session = factory.openSession();
        session.beginTransaction();
        emp1 = (Employee) session.get(Employee.class, 1);
        System.out.println("In Main ");
        System.out.println(emp1.getName()+" --- "+emp1.getSalary());
        emp1.setSalary(1000.0);
        Thread t1 = new Task();
        t1.run();
        Thread.sleep(3000);
        session.flush();
        session.getTransaction().commit();
        session.close();
        Thread t2 = new Task2();
        t2.run();
    }
}