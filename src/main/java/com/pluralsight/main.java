package com.pluralsight;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        //user input system
        Scanner userInput = new Scanner(System.in);

        //object: vehicles
        Vehicle vehicle1 = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        Vehicle vehicle2 = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        Vehicle vehicle3 = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        Vehicle vehicle4 = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        Vehicle vehicle5 = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        Vehicle vehicle6 = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        //body: array of vehicle inventory
        Vehicle[] vehicleInventory = new Vehicle[20];
        //counter
        int i = 0;
        vehicleInventory[i++] = vehicle1;
        vehicleInventory[i++] = vehicle2;
        vehicleInventory[i++] = vehicle3;
        vehicleInventory[i++] = vehicle4;
        vehicleInventory[i++] = vehicle5;
        vehicleInventory[i++] = vehicle6;


      //action: loop + command (user input)

        //loop
        while (true) {
            System.out.print("\nWhat do you want to do?"
                            + "\n1 - List all vehicles"
                            + "\n2 - Search by make/model"
                            + "\n3 - Search by price range"
                            + "\n5 - Add a vehicle"
                            + "\n6 - Quit"
                            + "\nEnter your command: ");
            int command = userInput.nextInt();
            // Clear buffer
            userInput.nextLine();
            //commands
            switch(command){
                case 1 -> ;
                case 2 -> ;
                case 3 -> ;
                case 4 -> ;
                case 5 -> ;

            }
            //print command
            System.out.println();

        }

        //command methods
        //1: list all vehicles
        void listVehicles(int i, Vehicle[] vehicleInventory) {

        }
        ){

        }

        //2:search my make/model

        //3: search by price (sort)

        //4: search by color

        //5: add vehicle

        //6: quit




    }
}

