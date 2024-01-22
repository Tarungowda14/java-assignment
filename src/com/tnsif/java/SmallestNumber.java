package com.tnsif.java;

import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get three numbers from the user
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();

        // Find and display the smallest number
        findAndDisplaySmallestNumber(num1, num2, num3);

        // Close the scanner
        scanner.close();
    }

    // Method to find and display the smallest number
    private static void findAndDisplaySmallestNumber(int num1, int num2, int num3) {
        int smallestNumber = (num1 <= num2) ? (num1 <= num3 ? num1 : num3)
                            : (num2 <= num3 ? num2 : num3);

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("The smallest number is: " + smallestNumber);
        }
    }
}