package com.pluralsight;

public class main {
    public static void main(String[] args) {
        //user input system

        //object: vehicles
        Vehicle vehicle1 = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        Vehicle vehicle2 = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        Vehicle vehicle3 = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        Vehicle vehicle4 = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        Vehicle vehicle5 = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        Vehicle vehicle6 = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        //body: array of vehicle inventory
        Vehicle[] vehicleInventory = new Vehicle[20];
        vehicleInventory[0] = vehicle1;
        vehicleInventory[1] = vehicle2;
        vehicleInventory[2] = vehicle3;
        vehicleInventory[3] = vehicle4;
        vehicleInventory[4] = vehicle5;
        vehicleInventory[5] = vehicle6;


        //action: loop + counter + command (user input)

    }
}

