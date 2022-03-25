package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class PatientsArrayList {
    public static void main(String[] args) {
        Patients p1 = new Patients("Kajal agarwal", 34, "Surgery",
                new Address("1-2-3", "abc street", "abc city",
                        "abc state", 123456));
        Patients p2 = new Patients("Payal Rajputh", 29, "Malaria",
                new Address("4-5-6", "xyz street", "xyz city",
                        "xyz state", 654321));
        ArrayList<Patients> patientsList = new ArrayList<>(Arrays.asList(p1, p2));
        for (int i = 0; i < patientsList.size(); i++) {
            System.out.println("Fetching the Patient " + (i + 1) + " details: ");
            System.out.println("Name: " + patientsList.get(i).name);
            System.out.println("age: " + patientsList.get(i).age);
            System.out.println("Disease diagnosed with : " + patientsList.get(i).disease);
            System.out.println("Address: " + patientsList.get(i).address.lane1);
            System.out.println(patientsList.get(i).address.lane2);
            System.out.println(patientsList.get(i).address.city);
            System.out.println(patientsList.get(i).address.state);
            System.out.println(patientsList.get(i).address.pinCode);
        }
    }
}
