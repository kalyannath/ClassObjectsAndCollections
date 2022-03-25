package com.company;

public class Address {
    public String lane1;
    public String lane2;
    public String city;
    public String state;
    public Integer pinCode;

    public Address(String lane1, String lane2, String city,
                   String state, Integer pinCode) {
        this.lane1 = lane1;
        this.lane2 = lane2;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    public String getLane1() { return lane1; }
    public void setLane1(String lane1) { this.lane1 = lane1; }
    public String getLane2() { return lane2; }
    public void setLane2(String lane2) { this.lane2 = lane2; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    public Integer getPinCode() { return pinCode; }
    public void setPinCode(Integer pinCode) { this.pinCode = pinCode; }
}
