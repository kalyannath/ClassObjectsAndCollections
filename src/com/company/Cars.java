package com.company;

import com.sun.jdi.request.ThreadStartRequest;

public class Cars {
    public String company;
    public Float mileagePer100KM;
    public Integer seatingCapacity;
    public String carNumber;

    public Cars(String company, Float mileagePer100KM,
                Integer seatingCapacity, String carNumber) {
        this.company = company;
        this.mileagePer100KM = mileagePer100KM;
        this.seatingCapacity = seatingCapacity;
        this.carNumber = carNumber;
    }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }
    public Float getMileagePer100KM() { return mileagePer100KM; }
    public void setMileagePer100KM(Float mileagePer100KM) { this.mileagePer100KM = mileagePer100KM; }
    public Integer getSeatingCapacity() { return seatingCapacity; }
    public void setSeatingCapacity(Integer seatingCapacity) { this.seatingCapacity = seatingCapacity; }
    public String getCarNumber() { return carNumber; }
    public void setCarNumber(String carNumber) { this.carNumber = carNumber; }
}
