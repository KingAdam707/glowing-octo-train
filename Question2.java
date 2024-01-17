package exercises;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name = input.nextLine();

		for (int i = 1; i <= (name.length() + 4); i++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.println("* " + name + " *");
		
		for (int i = 1; i <= (name.length() + 4); i++) {
			System.out.print("*");
		}
		
		
		input.close();
	}

}
