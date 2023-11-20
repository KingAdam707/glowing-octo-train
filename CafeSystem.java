package csc1025Practical6;

import java.util.Scanner;
import java.util.Arrays;

public class CafeSystem {

	/**
	 * 
	 * PURPOSE: Display a Menu from which the user selects items and they are
	 * presented with a bill when they have completed their order
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// <<-------------[DECLARATION AND INITIALISATION OF VARIABLES]--------->>

		Scanner scanner = new Scanner(System.in);// use the keyboard as input
		int itemChoice;// holds menu choice 0-4
		String repeat;// Repeats if 'yes' or 'no'
		double totalPrice = 0.0;// Must be initialised as otherwise a compiler error raised
		String[] items = {"Coffee", "Tea", "Sandwich", "Cake", "Latte"};
		double[] prices = {2.00, 1.80, 4.50, 3.20, 3.60};
		
		// <<----------[PROVIDE INFORMATION AND CONTEXT TO THE USER]---------->>
		System.out.println("Welcome to the Cafe Menu Calculator!");
		System.out.println("Menu:");
		
		for (int i = 0; i<5; i++) {
			System.out.printf("%d. %-10s- £%.2f%n",(i+1),items[i],prices[i]);
		}
		System.out.println();
		
		
		

		// <<-------------------------[MAIN BUSINESS LOGIC]------------------------->>

		do {

			System.out.print("Enter your choice: ");
			itemChoice = scanner.nextInt();
			
			while (itemChoice>5 || itemChoice<1) {
				System.out.println("That item was not on the menu!");
				System.out.print("Enter your choice: ");
				itemChoice = scanner.nextInt();
			}
			
			totalPrice+=prices[itemChoice-1]; 

			System.out.print("Would you like to order more (Yes or No):");
			scanner.nextLine();
			repeat = scanner.nextLine();

		} while (repeat.equalsIgnoreCase("YES"));// REMEMBER THE ;

		// <<------------------[OUTPUT RESULTS TO USER]--------------------->>

		System.out.printf("---------------------%n");
		System.out.printf("Total cost: £%.2f%n", totalPrice);// Display total cost to 2 decimal places

		// <<----------------------[END GRACEFULLY AND TIDY UP]----------->>

		scanner.close();// Close the scanner
		System.out.printf("---------------------%n");

		// <<-------------------[REFLECTION]-------------------------->>

		System.out.printf("I think this refactoring is better because it has used code more efficiently and this overall took less lines of code");

	}

}
