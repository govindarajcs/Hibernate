package com.test.entity;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Employee implements Serializable{

    @Id
    Integer id;
    @Column
    String name;
    
    @Lob
    String description;
    
    @Lob
    Byte exampleTest;
    
    @Embedded
    @AttributeOverrides({@AttributeOverride(name="street", column = @Column(name="home_Street")),
        @AttributeOverride(name="state", column = @Column(name="home_State")),
        @AttributeOverride(name="pincode", column = @Column(name="home_pincode")),
        @AttributeOverride(name="area", column = @Column(name="home_area")),
        @AttributeOverride(name="city", column = @Column(name="home_city")),
        @AttributeOverride(name="doorNo", column = @Column(name="home_doorNo"))}
)
    Address homeAddress;
    

    @Embedded
    @AttributeOverrides({@AttributeOverride(name="street", column = @Column(name="Office_Street")),
            @AttributeOverride(name="state", column = @Column(name="Office_State")),
            @AttributeOverride(name="pincode", column = @Column(name="Office_pincode")),
            @AttributeOverride(name="area", column = @Column(name="Office_area")),
            @AttributeOverride(name="city", column = @Column(name="Office_city")),
            @AttributeOverride(name="doorNo", column = @Column(name="Office_doorNo"))}
    )
    Address officeAddress;
    
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExampleTest(Byte exampleTest) {
        this.exampleTest = exampleTest;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }

    
}
