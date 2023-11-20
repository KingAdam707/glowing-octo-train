package csc1025.prac7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RobustCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueLoop = true;

		do {
			System.out.println(
					"1. Addition\r\n" + "2. Subtraction\r\n" + "3. Multiplication\r\n" + "4. Division\r\n" + "0. Exit");
			System.out.print("Enter your choice:");
			int choice = choiceOption();

			if (choice == 0) {
				System.out.println("Exiting the calculator. Goodbye!");
				continueLoop = false;
				break;
			}

			System.out.print("Enter the first number:");
			double num1 = num1();

			System.out.print("Enter the second number:");
			double num2 = num2();

			double result;
			try {

				if (choice == 1) {
					result = add(num1, num2);
				} else if (choice == 2) {
					result = subtract(num1, num2);
				} else if (choice == 3) {
					result = multiply(num1, num2);
				} else if (choice == 4) {
					result = divide(num1, num2);
				} else {
					System.out.println("Invalid choice. Please enter a valid option.");
					continue;
				}
				System.out.printf("Result: %.2f%n", result);
			} catch (java.lang.ArithmeticException ex) {
				System.out.println("Error: Division by zero is not allowed.");
				input.nextLine();
			}
		} while (continueLoop);
	}

	public static double add(double num1, double num2) {
		double result;
		result = num1 + num2;
		return result;

	}

	public static int choiceOption() {
		boolean continueLoopChoice = true;
		Scanner input = new Scanner(System.in);
		do {
			int choice = 0;
			try {
				choice = input.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
				input.nextLine();
				System.out.print("Enter your choice:");
				choice = choiceOption();
			} finally {
				return choice;
			}

		} while (continueLoopChoice);

	}

	public static double num1() {
		boolean continueLoopNum1 = true;
		Scanner input = new Scanner(System.in);
		do {
			double num1 = 0;
			try {
				num1 = input.nextDouble();
			} catch (InputMismatchException Ex) {
				System.out.println("Invalid input. Please enter a valid number.");
				input.nextLine();
				System.out.print("Enter first number: ");
				num1 = num1();
			} finally {
				return num1;
			}
		} while (continueLoopNum1);
	}
	
	
	public static double num2() {
		boolean continueLoopNum2 = true;
		Scanner input = new Scanner(System.in);
		do {
			double num2 = 0;
			try {
				num2 = input.nextDouble();
			} catch (InputMismatchException Ex) {
				System.out.println("Invalid input. Please enter a valid number.");
				input.nextLine();
				System.out.print("Enter second number: ");
				num2 = num2();
			} finally {
				return num2;
			}
		} while (continueLoopNum2);
	}

	public static double subtract(double num1, double num2) {
		double result;
		result = num1 - num2;
		return result;

	}

	public static double multiply(double num1, double num2) {
		double result;
		result = num1 * num2;
		return result;

	}

	private static double divide(double num1, double num2) throws ArithmeticException {
		if (num2 != 0) {
			double result;
			result = num1 / num2;
			return result;
		} else {
			throw new ArithmeticException("Error: Division by zero is not allowed.");

		}
	}

}
