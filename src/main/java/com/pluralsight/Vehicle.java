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


    //getters: need return type
    long getVehicleID(){
        return this.vehicleID;
    }

    String getMakeModel(){
        return this.makeModel;
    }

    String getColor(){
        return this.color;
    }

    int getOdometerReading(){
        return this.odometerReading;
    }

    double getPrice(){
        return this.price;
    }


    //setters: Return=void + need parameters
    void setVehicleID(long vehicleID){
        this.vehicleID = vehicleID;
    }

    void setMakeModel(String makeModel){
        this.makeModel = makeModel;
    }

    void setColor(String color){
        this.color = color;
    }

    void setOdometerReading(int odometerReading){
        this.odometerReading = odometerReading;
    }

    void setPrice(double price){
        this.price = price;
    }

}
