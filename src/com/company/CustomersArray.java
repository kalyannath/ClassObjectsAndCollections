package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomersArray {
    public static void main(String[] args) {
        Customers c1 = new Customers("Kalyan", "N", "16-06-1997",
                1234567890L, new Address("1-2-3", "abc street", "abc city",
                "abc state", 123456));
        Customers c2 = new Customers("Raju", "K", "11-01-1999",
                9876543210L, new Address("4-5-6", "xyz street", "xyz city",
                "xyz state", 654321));
        ArrayList<Customers> customerList = new ArrayList<>(Arrays.asList(c1, c2));
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println("customer " + (i + 1) + " details: ");
            System.out.println("First name: " + customerList.get(i).firstName);
            System.out.println("Last name: " + customerList.get(i).lastName);
            System.out.println("Date of birth: " + customerList.get(i).dateOfBirth);
            System.out.println("Phone number: " + customerList.get(i).phoneNumber);
            System.out.println("Address : " + customerList.get(i).address.lane1);
            System.out.println(customerList.get(i).address.lane2);
            System.out.println(customerList.get(i).address.city);
            System.out.println(customerList.get(i).address.state);
            System.out.println(customerList.get(i).address.pinCode);
            System.out.println("*********************");
        }
    }
}
