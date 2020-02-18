package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player chase = new Player("Chase", 10, 15);
        System.out.println(chase);
        saveObject(chase);

        chase.setHitPoints(8);
        System.out.println(chase);
        chase.setWeapon("Mitts");
        saveObject(chase);
//        loadObject(chase);
        System.out.println(chase);

        Car firstCar = new Car("Dodge", "Caravan", "1990", "red", "automatic");
        System.out.println(firstCar);
        saveObject(firstCar);

        firstCar.setColor("sun-faded red");
        System.out.println(firstCar);
        firstCar.setTransmission("inoperable");
        saveObject(firstCar);
//        loadObject(firstCar);
        System.out.println(firstCar);

    }

    public static List<String> readValues() {
        List<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" + "1 to enter a string\n" + "0 to quit");

        while(!quit) {
            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        List<String> values = readValues();
        objectToLoad.read(values);
    }
}
