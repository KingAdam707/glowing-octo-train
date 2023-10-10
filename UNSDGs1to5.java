package csc1025.prac3.part2;
import java.util.Scanner;

public class UNSDGs1to5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of an SDG (1-5): ");
		int number = input.nextInt();
		switch(number) {
		case 1 : System.out.print("No Poverty: End poverty in all its forms everywhere");
		break;
		case 2 : System.out.print("Zero Hunger: End hunger, achieve food security and improved nutrition and promote sustainable agriculture");
		break;
		case 3 : System.out.print("Good Health and Well-being: Ensure healthy lives and promote well-being for all at all ages");
		break;
		case 4 : System.out.print("Quality Education: Ensure inclusive and equitable quality education and promote lifelong learning opportunities for all");
		break;
		case 5 : System.out.print("Gender Equality: Achieve gender equality and empower all women and girls");
		break;
		default : System.out.print("nvalid input. Please enter a number between 1 and 5");
		}
		
		input.close();


	}

}
