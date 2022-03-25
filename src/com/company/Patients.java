package com.company;

public class Patients {
    public String name;
    public Integer age;
    public String disease;
    public Address address;

    public Patients(String name, Integer age, String disease, Address address) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.address = address;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    public String getDisease() { return disease; }
    public void setDisease(String disease) { this.disease = disease; }
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
}
