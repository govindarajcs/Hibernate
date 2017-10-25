package com.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Address {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Integer id;
    @Column
    Integer doorNo;
    @Column
    String streetName;
    @Column
    String city;
    @Column
    String state;
    @Column
    Integer pincode;
    @Column
    String landmark;
    @OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    Employee employee;
    
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public Integer getDoorNo() {
        return doorNo;
    }
    public void setDoorNo(Integer doorNo) {
        this.doorNo = doorNo;
    }
    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Integer getPincode() {
        return pincode;
    }
    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }
    public String getLandmark() {
        return landmark;
    }
    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }
    public Address(Integer doorNo, String streetName, String city, String state, Integer pincode, String landmark) {
        super();
        this.doorNo = doorNo;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.landmark = landmark;
    }
    public Address() {
        super();
    }

}
