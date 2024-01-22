package com.tnsif.java;

import java.util.Scanner;

class Customer {
    private String name;
    private String source;
    private String destination;

    // Constructor
    public Customer(String name, String source, String destination) {
        this.name = name;
        this.source = source;
        this.destination = destination;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }
}

public class Airline {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Enter source");
        String source = scanner.nextLine();

        System.out.println("Enter destination");
        String destination = scanner.nextLine();

        Customer customer = new Customer(name, source, destination);

        // Display message with simulated bold text
        displayMessageWithSimulatedBoldText(customer);

        scanner.close();
    }

    private static void displayMessageWithSimulatedBoldText(Customer customer) {
        System.out.print("Dear \u001B[1m" + customer.getName() + "\u001B[0m, ");
        System.out.print("welcome onboard with service from \u001B[1m" + customer.getSource() + "\u001B[0m");
        System.out.print("to \u001B[1m" + customer.getDestination() + "\u001B[0m. ");
        System.out.print("Thank you for choosing Sky Airline. ");
        System.out.print("Enjoy your flight");
    }

    }