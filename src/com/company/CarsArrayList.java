package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class CarsArrayList {
    public static void main(String[] args) {
        Cars car1 = new Cars("Porsche", 5F, 2, "abc123");
        Cars car2 = new Cars("Audi", 6F, 4, "xyz123");
        Cars car3 = new Cars("Benz", 4.5F, 2, "def456");
        ArrayList<Cars> carsList = new ArrayList<>(Arrays.asList(car1, car2, car3));
        for (int i = 0; i < carsList.size(); i++) {
            System.out.println("car " + (i + 1) + " company name is " + carsList.get(i).company);
            System.out.println("car " + (i + 1) + " mileage is " + carsList.get(i).mileagePer100KM);
            System.out.println("car " + (i + 1) + " seating capacity is " + carsList.get(i).seatingCapacity);
            System.out.println("car " + (i + 1) + " number is " + carsList.get(i).carNumber);
            System.out.println("**********************************");
        }
    }
}
