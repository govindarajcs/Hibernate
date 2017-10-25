package com.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Course;
import com.hibernate.entity.Student;

public class HibernateMain1 {

    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("com/hibernate/config/config.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Student student = new Student();
        student.setId(1);
        student.setName("Raj");
        student.setSalary(10000f);
        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Rajesh");
        student2.setSalary(10000f);
        Course course = new Course();
        course.setId(1);
        course.setName("CSE");
        student.setCourse(course);
        student2.setCourse(course);
        course.getCourseList().add(student);
        course.getCourseList().add(student2);

        Session session = factory.openSession();
        session.beginTransaction();
        session.save(course);
        session.getTransaction().commit();
        session.close();
        
        Session session1 = factory.openSession();
        session1.beginTransaction();
        Course courseGet = session1.get(Course.class, 1);
        System.out.println(courseGet.getName());
        System.out.println(courseGet.getCourseList().size());
        Course courseGet1 = session1.get(Course.class, 1);
        System.out.println(courseGet1.getName());
        System.out.println(courseGet1.getCourseList().size());
        session1.getTransaction().commit();
        session1.close();
        
        Session session2 = factory.openSession();
        session2.beginTransaction();
        Course courseGet2 = session2.get(Course.class, 1);
        System.out.println(courseGet2.getName());
        System.out.println(courseGet2.getCourseList().size());
        session2.getTransaction().commit();
        session2.close();
    }
}