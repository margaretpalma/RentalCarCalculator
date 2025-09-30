package com.pluralsight;

import java.util.Scanner;

public class WithMethods {

        public static void main(String[] args) {
            // known values

            double priceOfBasicCarRentalPerDay = 29.99;
            float percentSurchargeForUnderage = 0.30f;
            int userAgeLimit = 25;
            //what values do i need to get from the user?

            String pickUpDate = promptForString("When do you want to rent the car");
            int numberOfDays = promptForInt("How many days?");
            boolean optionTollTag = promptForYesNo("Do you want a Toll tag?");
            boolean optionGPS = promptForYesNo("Do you want a GPS");
            boolean optionRoadsideAssistance = promptForYesNo("Do you want Roadside assistance?");
            int age = promptForInt("How old are you?");

            //what needs to be calculated?

            double basicCarRentalAmount = numberOfDays * priceOfBasicCarRentalPerDay;
            double optionsAmount = calcOptionamount(numberOfDays, optionTollTag, optionGPS, optionRoadsideAssistance) : 0;
            double totalCost =

            //display the results
            System.out.println("Quote for rental: " );
            System.out.printf("Basic Car Rental:    $%.2f\n", basicCarRentalAmount);
            System.out.printf("Options:             $%.2f\n", optionsAmount);
            System.out.printf("Underage Surcharge:  $%.2f\n", underageSurcharge);
            System.out.printf("Total:               $%.2f\n", totalCost);
        }
        //demo

        private static double calcOptionamount(int numberOfDays, boolean optionTollTag, boolean optionGPS, boolean optionRoadsideAssistance) {

            double priceOfOptionTollTag = 3.95;
            double priceofOptionGPS = 2.95;
            double priceofOptionRoadsideAssistance = 3.95;

            double dayprice = (optionTollTag) ? priceOfOptionTollTag : 0;
            dayprice += (optionGPS) ? priceofOptionGPS : 0;
            dayprice += (optionRoadsideAssistance) ? optionRoadsideAssistance : 0;
        }

        private static boolean promptForYesNo(String questionToAsk) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(questionToAsk + "(Y/N:");
            String result = scanner.nextLine();
            return(result.equalsIgnoreCase("Y") || result.equalsIgnoreCase("YES"));

        }
        private static int promptForInt(String questionToAsk) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(questionToAsk + ":");
            int result = scanner.nextInt();
            scanner.nextLine();
            return result;

    }
        private static String promptForString(String questionToAsk) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(questionToAsk + ":");
            return scanner.nextLine();
        }
    }