package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //what are my known values?
        double priceOfBasicCarRentalPerDay = 29.99;
        double priceOfOptionTollTag = 3.95;
        double priceofOptionGPS = 2.95;
        double priceofOptionRoadsideAssistance = 3.95;
        float  percentSurchargeForUnderage = 0.30f;
        int userageLimit = 25;


        //what values do i need to get from the user?
        System.out.print("What is the pickup date? ");
        String pickupDate = scanner.nextLine();

        System.out.print("How many days? ");
        int numberOfDays = scanner.nextInt();
        scanner.nextLine();                //clears the CRLF

        System.out.print("Do you want toll tag? Y/N ");
        boolean optionTollTag = scanner.nextLine().equalsIgnoreCase("y");  //.equalsIgnoreCase

        System.out.print("Do you want GPS? Y/N ");
        boolean optionGPS = scanner.nextLine().equalsIgnoreCase("y");  //.equalsIgnoreCase

        System.out.print("Do you want roadside Assistance? Y/N ");
        boolean optionRoadsideAssistance = scanner.nextLine().equalsIgnoreCase("y");  //.equalsIgnoreCase

        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();         //clears CRLF

        //what needs to be calculated?
        double basicCarRentalAmount = 0;
        double optionsAmount = 0;
        double underageSurcharge = 0;
        double totalCost = 0;

        //display the results
        System.out.println("Quote for rental: " );
        System.out.printf("Basic Car Rental:    $%.2f\n", basicCarRentalAmount);
        System.out.printf("Options:             $%.2f\n", optionsAmount);
        System.out.printf("Underage Surcharge:  $%.2f\n", underageSurcharge);
        System.out.printf("Total:               $%.2f\n", totalCost);
    }
}