package csc1025.prac3.part2;
import java.util.Scanner;
public class TemperatureConversion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Temperature: ");
		int temp = input.nextInt();
		input.nextLine();
		System.out.println("Enter C or F: ");
		String scale = input.nextLine();
		
		if (scale.equalsIgnoreCase("c")) {
			int fTemp = temp * 9/5 + 32;
			System.out.println(fTemp + "°F");
					}
		else if (scale.equalsIgnoreCase("f")) {
			int cTemp = (temp-32)*5/9;
			System.out.print(cTemp + "°C");
		}
		else {System.out.print("Invalid scale entered. Please enter either 'c' for Celsius or 'f' for Fahrenheit.");}
		
		input.close();
		
		

	}

}
