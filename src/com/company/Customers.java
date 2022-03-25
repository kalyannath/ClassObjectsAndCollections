package com.company;

public class Customers {
    public String firstName;
//    public String middleName = null;
    public String lastName;
    public String dateOfBirth;
    public Long phoneNumber;
    public Address address;

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public Long getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(Long phoneNumber) { this.phoneNumber = phoneNumber; }
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    public Customers(String firstName, String lastName, String dateOfBirth,
                     Long phoneNumber, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
