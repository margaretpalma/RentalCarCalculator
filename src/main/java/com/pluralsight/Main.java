package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        //known value
        double priceOfBasicCarRentalPerDay = 29.99;
        double priceOfOptionTollTag = 3.95;
        double priceOfOptionGPS = 2.95;
        double priceOfOptionRoadsideAssistance = 3.95;
        float percentSurchargeForUnderage = 0.30f;
        int userAgeLimit = 25;
        //user value
        System.out.print("When do you want to rent the car?: ");
        String pickupDate = scanner.nextLine();


        System.out.print("How many days do you need it?: ");
        int numberOfDays = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Do you want a toll tag (Y/N): ");
        boolean optionTollTag = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Do you want a GPS (Y/N): ");
        boolean optionGPS = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Do you want Roadside Assistance (Y/N): ");
        boolean optionsRoadsideAssistance = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("How old are you?: ");
        int age = scanner.nextInt();
        scanner.nextLine();


        //what needs to be calculated?

        double basicCarRentalAmount = numberOfDays * priceOfBasicCarRentalPerDay ;

        double optionPerDayCumulative = (optionTollTag) ? priceOfOptionTollTag : 0;
        optionPerDayCumulative += (optionGPS) ? priceOfOptionGPS : 0;
        optionPerDayCumulative += (optionsRoadsideAssistance) ? priceOfOptionRoadsideAssistance : 0;

        double optionsAmount = optionPerDayCumulative * numberOfDays;

        double underageSurcharge = 0;

        if (age < userAgeLimit){
            underageSurcharge = basicCarRentalAmount * percentSurchargeForUnderage;
        }

        double totalCost = basicCarRentalAmount + optionsAmount + underageSurcharge;


        //display the results.
        System.out.println("Here is the quote for your rental:");
        System.out.printf("Basic Car Rental:    $%.2f\n",basicCarRentalAmount);
        System.out.printf("Options:             $%.2f\n",optionsAmount);
        System.out.printf("Underage Surcharge:  $%.2f\n",underageSurcharge);
        System.out.printf("Total:               $%.2f\n",totalCost);



    }
}