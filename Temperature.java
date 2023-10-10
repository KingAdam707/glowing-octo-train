package csc1025.prac3.part2;
import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Temperature: ");
		int temp = input.nextInt();
		
		if (temp>=30) {
			System.out.println("It’s hot outside");
			}
		
		
		else if (temp>=20 && temp<=29) {
			System.out.println("It's warm outside");
			}
		
		
		else if (temp<20) {
			System.out.println("It's cold outside");
			}
		
		input.close();
		

	}

}
