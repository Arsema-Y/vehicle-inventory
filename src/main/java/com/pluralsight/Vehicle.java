package com.pluralsight;

public class Vehicle {
    //attributes
    long vehicleID;
    String makeModel;
    String color;
    int odometerReading;
    double price;

    //constractor
    void vehicle(long vehicleID, String makeModel, String color, int odometerReading, double price){
        this.vehicleID = vehicleID;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;


    }

}
