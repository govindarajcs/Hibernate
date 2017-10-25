package com.test.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.entity.Department;
import com.test.entity.Student;

public class FetchExample2 {

    public static void main(String[] args) {
        //*********************************************************************************************************
        
        Department dep = new Department();
        dep.setDescription("ECE department");
        dep.setName("ECE");
        dep.setId(1);
        Department dep1 = new Department();
        dep1.setDescription("CSE Department");
        dep1.setName("CSE");
        dep1.setId(2);
        Department dep2 = new Department();
        dep2.setDescription("IT Department");
        dep2.setName("IT");
        dep2.setId(3);
        Department dep3 = new Department();
        dep3.setDescription("EEE Department");
        dep3.setName("EEE");
        dep3.setId(4);
        Department dep4 = new Department();
        dep4.setDescription("MECH Department");
        dep4.setName("MECH");
        dep4.setId(5);
        Department dep5 = new Department();
        dep5.setDescription("EIE Department");
        dep5.setName("EIE");
        dep5.setId(6);
        
        Student student1 = new Student();
        student1.setAge(29);
        student1.setId(1);
        student1.setAggregate(78f);
        student1.setBloodGroup("AB+");
        student1.setName("Govind");
        student1.setPucScore(87);
        student1.setDepartment(dep1);
        dep1.getStudentList().add(student1);
        
        Student student2 = new Student();
        student2.setId(2);
        student2.setAge(29);
        student2.setAggregate(78f);
        student2.setBloodGroup("AB+");
        student2.setName("Raj");
        student2.setPucScore(87);
        student2.setDepartment(dep1);
        dep1.getStudentList().add(student2);
        
        Student student3 = new Student();
        student3.setId(3);
        student3.setAge(29);
        student3.setAggregate(78f);
        student3.setBloodGroup("AB+");
        student3.setName("Shankar");
        student3.setPucScore(87);
        student3.setDepartment(dep1);
        dep1.getStudentList().add(student3);
        
        Student student4 = new Student();
        student4.setId(4);
        student4.setAge(29);
        student4.setAggregate(78f);
        student4.setBloodGroup("AB+");
        student4.setName("Govind");
        student4.setPucScore(87);
        student4.setDepartment(dep1);
        dep1.getStudentList().add(student4);
        
        Student student5 = new Student();
        student5.setId(5);
        student5.setAge(29);
        student5.setAggregate(78f);
        student5.setBloodGroup("AB+");
        student5.setName("Raj");
        student5.setPucScore(87);
        student5.setDepartment(dep);
        dep.getStudentList().add(student5);
        
        Student student6 = new Student();
        student6.setId(6);
        student6.setAge(29);
        student6.setAggregate(78f);
        student6.setBloodGroup("AB+");
        student6.setName("Shankar");
        student6.setPucScore(87);
        student6.setDepartment(dep);
        dep.getStudentList().add(student6);
        
        Student student7 = new Student();
        student7.setAge(29);
        student7.setId(7);
        student7.setAggregate(78f);
        student7.setBloodGroup("AB+");
        student7.setName("Govind");
        student7.setPucScore(87);
        student7.setDepartment(dep);
        dep.getStudentList().add(student7);
        
        Student student8 = new Student();
        student8.setId(8);
        student8.setAge(29);
        student8.setAggregate(78f);
        student8.setBloodGroup("AB+");
        student8.setName("Raj");
        student8.setPucScore(87);
        student8.setDepartment(dep);
        dep.getStudentList().add(student8);

        Student student9 = new Student();
        student9.setId(9);
        student9.setAge(29);
        student9.setAggregate(78f);
        student9.setBloodGroup("AB+");
        student9.setName("Shankar");
        student9.setPucScore(87);
        student9.setDepartment(dep2);
        dep2.getStudentList().add(student9);

        Student student10 = new Student();
        student10.setId(10);
        student10.setAge(29);
        student10.setAggregate(78f);
        student10.setBloodGroup("AB+");
        student10.setName("Govind");
        student10.setPucScore(87);
        student10.setDepartment(dep2);
        dep2.getStudentList().add(student10);
        
        Student student11 = new Student();
        student11.setId(11);
        student11.setAge(29);
        student11.setAggregate(78f);
        student11.setBloodGroup("AB+");
        student11.setName("Raj");
        student11.setPucScore(87);
        student11.setDepartment(dep2);
        dep2.getStudentList().add(student11);
        
        Student student12 = new Student();
        student12.setId(12);
        student12.setAge(29);
        student12.setAggregate(78f);
        student12.setBloodGroup("AB+");
        student12.setName("Shankar");
        student12.setPucScore(87);
        student12.setDepartment(dep2);
        dep2.getStudentList().add(student12);
        
        Student student13 = new Student();
        student13.setAge(29);
        student13.setId(13);
        student13.setAggregate(78f);
        student13.setBloodGroup("AB+");
        student13.setName("Govind");
        student13.setPucScore(87);
        student13.setDepartment(dep3);
        dep3.getStudentList().add(student13);
        
        Student student14 = new Student();
        student14.setId(14);
        student14.setAge(29);
        student14.setAggregate(78f);
        student14.setBloodGroup("AB+");
        student14.setName("Raj");
        student14.setPucScore(87);
        student14.setDepartment(dep3);
        dep3.getStudentList().add(student14);

        Student student15 = new Student();
        student15.setId(15);
        student15.setAge(29);
        student15.setAggregate(78f);
        student15.setBloodGroup("AB+");
        student15.setName("Shankar");
        student15.setPucScore(87);
        student15.setDepartment(dep3);
        dep3.getStudentList().add(student15);

        Student student16 = new Student();
        student16.setId(16);
        student16.setAge(29);
        student16.setAggregate(78f);
        student16.setBloodGroup("AB+");
        student16.setName("Govind");
        student16.setPucScore(87);
        student16.setDepartment(dep3);
        dep3.getStudentList().add(student16);
        
        Student student17 = new Student();
        student17.setId(17);
        student17.setAge(29);
        student17.setAggregate(78f);
        student17.setBloodGroup("AB+");
        student17.setName("Raj");
        student17.setPucScore(87);
        student17.setDepartment(dep4);
        dep4.getStudentList().add(student17);
        
        Student student18 = new Student();
        student18.setId(18);
        student18.setAge(29);
        student18.setAggregate(78f);
        student18.setBloodGroup("AB+");
        student18.setName("Shankar");
        student18.setPucScore(87);
        student18.setDepartment(dep4);
        dep4.getStudentList().add(student18);
        
        Student student19 = new Student();
        student19.setAge(29);
        student19.setId(19);
        student19.setAggregate(78f);
        student19.setBloodGroup("AB+");
        student19.setName("Govind");
        student19.setPucScore(87);
        student19.setDepartment(dep4);
        dep4.getStudentList().add(student19);
        
        Student student20 = new Student();
        student20.setId(20);
        student20.setAge(29);
        student20.setAggregate(78f);
        student20.setBloodGroup("AB+");
        student20.setName("Raj");
        student20.setPucScore(87);
        student20.setDepartment(dep4);
        dep4.getStudentList().add(student20);

        Student student21 = new Student();
        student21.setId(21);
        student21.setAge(29);
        student21.setAggregate(78f);
        student21.setBloodGroup("AB+");
        student21.setName("Shankar");
        student21.setPucScore(87);
        student21.setDepartment(dep5);
        dep5.getStudentList().add(student21);

        Student student22 = new Student();
        student22.setId(22);
        student22.setAge(29);
        student22.setAggregate(78f);
        student22.setBloodGroup("AB+");
        student22.setName("Govind");
        student22.setPucScore(87);
        student22.setDepartment(dep5);
        dep5.getStudentList().add(student22);
        
        Student student23 = new Student();
        student23.setId(23);
        student23.setAge(29);
        student23.setAggregate(78f);
        student23.setBloodGroup("AB+");
        student23.setName("Raj");
        student23.setPucScore(87);
        student23.setDepartment(dep5);
        dep5.getStudentList().add(student23);

        Student student24 = new Student();
        student24.setId(24);
        student24.setAge(29);
        student24.setAggregate(78f);
        student24.setBloodGroup("AB+");
        student24.setName("Shankar");
        student24.setPucScore(87);
        student24.setDepartment(dep5);
        dep5.getStudentList().add(student24);
        // *********************************************************************************************
        
        Configuration cfg = new Configuration().configure("com/hibernate/config/config.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        
        session.beginTransaction();
        session.persist(dep);
        session.persist(dep1);
        session.persist(dep2);
        session.persist(dep3);
        session.persist(dep4);
        session.persist(dep5);
        session.getTransaction().commit();
        session.close();
        
        session = factory.openSession();
        Query query = session.createQuery("from Department dep");
        List<Department> depList = query.getResultList();
        for(Department depTemp : depList){
            System.out.println(depTemp.getId()+"----"+depTemp.getName());
            for(Student student: depTemp.getStudentList()){
                System.out.println("\t\t"+student.getId()+"----"+student.getName());
            }
        }
    }
    
}