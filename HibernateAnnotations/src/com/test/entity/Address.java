package com.test.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    
    String street;
    String area;
    String pincode;
    String doorNo;
    String city;
    String state;
    public void setStreet(String street) {
        this.street = street;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
}
