package csc1025.prac3.part2;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter A Number: ");
		int number = input.nextInt();
		
		if (number % 2 == 0) {
			System.out.print("Even");
			} else {
				System.out.print("Odd");
			}
		input.close();
		

	}
	
}


