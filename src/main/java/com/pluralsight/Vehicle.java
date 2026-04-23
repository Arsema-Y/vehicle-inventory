package com.pluralsight;

public class Vehicle {
    //attributes
    private long vehicleID;
    private String makeModel;
    private String color;
    private int odometerReading;
    private double price;

    //constractor
    Vehicle(long vehicleID, String makeModel, String color, int odometerReading, double price){
        this.vehicleID = vehicleID;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;

    }


    //getters: need return type
    public long getVehicleID(){
        return this.vehicleID;
    }

    public String getMakeModel(){
        return this.makeModel;
    }

    public String getColor(){
        return this.color;
    }

    public int getOdometerReading(){
        return this.odometerReading;
    }

    public double getPrice(){
        return this.price;
    }


    //setters: Return=void + need parameters (=attributes)
    public void setVehicleID(long vehicleID){
        this.vehicleID = vehicleID;
    }

    public void setMakeModel(String makeModel){
        this.makeModel = makeModel;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setOdometerReading(int odometerReading){
        this.odometerReading = odometerReading;
    }

    public void setPrice(double price){
        this.price = price;
    }

}
