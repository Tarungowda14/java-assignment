package com.tnsif.java;

import java.util.Scanner;

public class NumberSwapper {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get two numbers from the user
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        // Swap and display the numbers
        swapAndDisplayNumbers(num1, num2);

        // Close the scanner
        scanner.close();
    }

    // Method to swap numbers using bitwise XOR and display the result
    private static void swapAndDisplayNumbers(int firstNumber, int secondNumber) {
        // Display original numbers
        System.out.println("Original Numbers: First = " + firstNumber + ", Second = " + secondNumber);

        // Swap numbers using bitwise XOR
        firstNumber = firstNumber ^ secondNumber;
        secondNumber = firstNumber ^ secondNumber;
        firstNumber = firstNumber ^ secondNumber;

        // Display swapped numbers
        System.out.println("Swapped Numbers: First = " + firstNumber + ", Second = " + secondNumber);
    }
}