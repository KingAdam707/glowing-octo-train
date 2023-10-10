package csc1025.prac2.part2;

public class SimpleInterestCalculation {

	public static void main(String[] args) {
		
		//Declaring principle value initially
		int principle=1000;
				
		//Declaring rate value as a percentage
		int rate=5;
				
		//Declaring time value in years
		int time=2;
				
		//Calculates the simple interest in one calculation
		int simpleInterest = (principle * rate * time) / 100;
				
		//Interest added on to initial money calculation
		int finalValue = simpleInterest + principle;
				
		//System prints the statement for the user to see
		System.out.println("The simple interest for a principal amount of 1000 with a rate of 5% per annum for a time period of 2 years is " + simpleInterest);
				
		//Interest added on to initial money output statement
		System.out.print("Your final money = " + finalValue);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
