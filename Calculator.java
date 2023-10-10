package csc1025.prac3.part2;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		float number_first = input.nextInt();
		
		System.out.print("Enter Second Number: ");
		float number_second = input.nextInt();
		input.nextLine();
		
		System.out.print("Choose an Operator (+, -, /, *): ");
		String operator = input.nextLine();
		char operators = operator.charAt(0);
		int sign = 0;
		
		if (operators == '+') {
			sign = 1;
			}else if (operators == '-') {
				sign = 2;
			}else if (operators == '/') {
				sign = 3;
			}else if (operators == '*') {
				sign = 4;
			}
		
		switch(sign) {
		case 1 : System.out.printf("%.4f",(number_first + number_second) );
		break;
		case 2 : System.out.printf("%.4f",(number_first - number_second) );
		break;
		case 3 : System.out.printf("%.4f",(number_first / number_second) );
		break;
		case 4 : System.out.printf("%.4f",(number_first * number_second) );
		break;
		default : System.out.println("Invalid operator. Please enter one of these operators: +, -, *, /");
		}
		
		input.close();
		
		
		
	
		
		
	}
}