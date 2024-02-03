package Assignment2;

import java.util.Scanner;

public class Booking {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	// Welcome message and input instructions
	     System.out.println("Welcome to Velan Resort!");
	     System.out.println("Please enter your details in the following format:");
	     System.out.println("<customer name> <number of adults> <number of children> <number of days>");

	// Read user input
	     String input = scanner.nextLine();
	     String[] details = input.split(" ");

	// Extracting details from input
	     String name = details[0];
	     int numAdults = Integer.parseInt(details[1]);
	     int numChildren = Integer.parseInt(details[2]);
	     int numDays = Integer.parseInt(details[3]);

	// Prices per day
	     int adultPricePerDay = 1000;
	     int childPricePerDay = 650;

	// Check for invalid inputs
	     if (numAdults < 0) {
	         System.out.println("Invalid input for number of adults");
	      	}
	     else if (numChildren < 0) {
	         System.out.println("Invalid input for number of children");
	        }
	     else if (numDays <= 0) {
	         System.out.println("Invalid input for number of days");
	        } 
	     else {
	         int totalCost = (numAdults * adultPricePerDay + numChildren * childPricePerDay) * numDays;
	         
	            System.out.println(name + ", your booking is confirmed and the total cost is $" + totalCost);
	       }
	  }
}
