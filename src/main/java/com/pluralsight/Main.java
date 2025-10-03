package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] inventory = new Vehicle[20];
        int quantityOfVehicles;

        inventory[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        inventory[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        inventory[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        inventory[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        inventory[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        inventory[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
        inventory[6]  = new Vehicle(101127, "Nissan Altima", "Gray", 82000, 6800);
        inventory[7]  = new Vehicle(101128, "Hyundai Sonata", "Silver", 40000, 12500);
        inventory[8]  = new Vehicle(101129, "Kia Sportage", "White", 35000, 14900);

        quantityOfVehicles = 9;

        int command;
        do{


            System.out.println("What do you want to do?");
            System.out.println("  1 - List all vehicles");
            System.out.println("  2 - Search by make/model");
            System.out.println("  3 - Search by price range");
            System.out.println("  4 - Search by color");
            System.out.println("  5 - Add a vehicle");
            System.out.println("  6 - Quit");
            System.out.print("Enter your command: ");

            command = scanner.nextInt();
            switch(command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    findVehiclesByPrice();
                    break;
                case 5:
                    addAVehicle();
                    break;
                case 6:
                    return;
            }

        } while(command != 6);




    }


    private static void listAllVehicles(){
        System.out.println("Listing out vehicles....");
        //todo: list all vehicles here...
    }

    private static void findVehiclesByPrice() {

    }

    private static void addAVehicle() {
    }

}