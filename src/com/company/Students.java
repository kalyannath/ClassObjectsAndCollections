package com.company;

public class Students {
    public String name;
    public Integer rollNumber;
    public Integer standard;
    public Address address;

    public Students(String name, Integer rollNumber,
                    Integer standard, Address address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.standard = standard;
        this.address = address;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getRollNumber() { return rollNumber; }
    public void setRollNumber(Integer rollNumber) { this.rollNumber = rollNumber; }
    public Integer getStandard() { return standard; }
    public void setStandard(Integer standard) { this.standard = standard; }
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
}
