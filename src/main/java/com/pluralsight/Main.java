package com.pluralsight;

import java.util.Scanner;

public class Main {

    private static Vehicle[] inventory = new Vehicle[20];
    private static int quantityOfVehicles;

    public static void main(String[] args) {




        inventory[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        inventory[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        inventory[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        inventory[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        inventory[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        inventory[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
        inventory[6]  = new Vehicle(101127, "Nissan Altima", "Gray", 82000, 6800);
        inventory[7]  = new Vehicle(101128, "Hyundai Sonata", "Silver", 40000, 12500);
        inventory[8]  = new Vehicle(101129, "Kia Sportage", "White", 35000, 14900);
        inventory[9] = new Vehicle(201121, "Ford Explorer", "Blue", 4000, 30500);
        inventory[10] = new Vehicle(291107, "Ford F150", "Black", 6500, 45500);
        quantityOfVehicles = 11;

        int command;

        while(true){


            System.out.println("What do you want to do?");
            System.out.println("  1 - List all vehicles");
            System.out.println("  2 - Search by make/model");
            System.out.println("  3 - Search by price range");
            System.out.println("  4 - Search by color");
            //todo: add color to below options!
            System.out.println("  5 - Add a vehicle");
            System.out.println("  6 - Quit");

            command = ConsoleHelper.promptForInt("Enter your command");

            switch(command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    findVehiclesByMakeModel();
                case 3:
                    findVehiclesByPrice();
                    break;
                case 5:
                    addAVehicle();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("INVALID COMMAND!! Please select a valid option.");
                    break;
            }

        }




    }

    private static void findVehiclesByMakeModel() {
        //prompt the user for the make/model to search for.
        String makeModelToSearchFor = ConsoleHelper.promptForString("Please enter a make/model to search for");


        //loop through inventory and add any matching value to result
        for(Vehicle v : inventory){
            if(v == null) {
                continue;
            }
            if (v.getMakeModel().toLowerCase().contains(makeModelToSearchFor.toLowerCase())) {
                displayVehicle(v);
            }
//            if (v.getMakeModel().contains(makeModelToSearchFor)) {
//                displayVehicle(v);
//            }

        }

    }

    private static void displayVehicle(Vehicle v){

        System.out.println(v);

       // System.out.print(v.getVehicleId() + " ");
       // System.out.println(v.getColor() + " " + v.getMakeModel());
        //todo: make this not so ugly, also more complete.
    }


    private static void listAllVehicles(){
        System.out.println("Listing out vehicles....");
        System.out.println(Vehicle.getTableHeader());
        for(Vehicle v : inventory){
            if(v == null) {
                continue;
            }
            displayVehicle(v);
        }

    }

    private static void findVehiclesByPrice() {
//todo: finish search by price
    }

    private static void addAVehicle() {

        long vehicleId = ConsoleHelper.promptForLong("What is the vehicle ID");
        String makeModel = ConsoleHelper.promptForString("Please enter the make/mode");
        String color = ConsoleHelper.promptForString("Please enter the color");
        int odometerReading = ConsoleHelper.promptForInt("Please enter the mileage");
        float price = ConsoleHelper.promptForFloat("What is the cost of the vehicle");

        Vehicle newVehicle = new Vehicle(vehicleId, makeModel, color, odometerReading, price);
        inventory[quantityOfVehicles] = newVehicle;
        quantityOfVehicles++;

    }

}