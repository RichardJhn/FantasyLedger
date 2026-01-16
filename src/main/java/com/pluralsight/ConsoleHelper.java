package com.pluralsight;

import java.util.Scanner;

public class ConsoleHelper {

private static Scanner scanner = new Scanner(System.in);

//    public static String promptForString(String prompt) {
//        System.out.print(prompt + ": ");
//        return scanner.nextLine();
//    }

    public static String promptForString(String prompt){
        String input = "";
        while (input.isEmpty()) {
            System.out.print(prompt + ": ");
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("❌ Input cannot be empty. Please try again.\n");
            }
        }
        return input;
    }

    public static int promptForInt(String prompt) {
        int result = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print(prompt + ": $");
            String input = scanner.nextLine().trim();

            try {
                result = Integer.parseInt(input);
                valid = true;
            }catch (NumberFormatException e) {
                System.out.println("❌ Invalid input. Please enter a valid number.\n");
            }
        }
        return result;
    }

    public static char promptForChar(String prompt) {
        System.out.print(prompt + ": ");
        char result = scanner.next().toUpperCase().charAt(0);
        scanner.nextLine();
        return result;
    }
//    public static double promptForDouble(String prompt) {
//
//
//        System.out.print(prompt + ": ");
//        double result = scanner.nextDouble();
//        scanner.nextLine();
//        return result;
//
//
//    }

    public static double promptForDouble(String prompt){
        double result = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(prompt + ": $");  // Keep your $ symbol
            String input = scanner.nextLine().trim(); // Read input as String

            try {
                result = Double.parseDouble(input); // Try converting to double
                valid = true;                        // Success!
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input. Please enter a valid number.\n"); // Error message
            }
        }

        return result;
    }

}
