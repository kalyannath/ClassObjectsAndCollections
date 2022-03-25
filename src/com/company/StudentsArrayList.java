package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsArrayList {
    public static void main(String[] args) {
        Students s1 = new Students("Kalyan N", 1, 10,
                new Address("1-2-3", "abc street", "abc city",
                "abc state", 123456));
        Students s2 = new Students("Bhimla Nayak", 2, 9,
                new Address("4-5-6", "xyz street", "xyz city",
                        "xyz state", 654321));

        ArrayList<Students> studentsList = new ArrayList<>(Arrays.asList(s1, s2));
        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println("student " + (i + 1) + " Details: ");
            System.out.println("Student name : " + studentsList.get(i).name);
            System.out.println("Roll number : " + studentsList.get(i).rollNumber);
            System.out.println("Standard : " + studentsList.get(i).standard);
            System.out.println("Address : " + studentsList.get(i).address.lane1);
            System.out.println(studentsList.get(i).address.lane2);
            System.out.println(studentsList.get(i).address.city);
            System.out.println(studentsList.get(i).address.state);
            System.out.println(studentsList.get(i).address.pinCode);
            System.out.println("***********************************");
        }
    }
}
