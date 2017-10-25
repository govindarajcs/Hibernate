package com.hibernate.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable(true)
@Cache(usage=CacheConcurrencyStrategy.NONE)
public class Course {
    
    @Id
    Integer id;
    @Column
    String name;
    @OneToMany(mappedBy="course",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
    List<Student> courseList = new ArrayList<Student>();
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Student> getCourseList() {
        return courseList;
    }
    public void setCourseList(List<Student> courseList) {
        this.courseList = courseList;
    }
    
}