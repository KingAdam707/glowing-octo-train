package csc1025.prac2.part2;

public class CurrencyConversion {

	public static void main(String[] args) {
		
		
		
		float usdAmount = 50.00f;
		
		float gbpAmount = 300.00f;
		
		float conversionRateUSD = 0.85f;
		
		float conversionRateGBP = 0.85f;
		
		float convertedAmountGBP = 0.00f;
		float convertedAmountUSD = 0.00f;
		
		
		
		
		convertedAmountGBP = usdAmount * conversionRateGBP;
		convertedAmountUSD = gbpAmount / conversionRateUSD;
		
		
		System.out.println("USD " + usdAmount + " is equivalent to " + convertedAmountGBP + " in the GBP");
		
		System.out.printf("GBP " + gbpAmount + " is equivalent to %.2f in the USD", convertedAmountUSD);
		
		
		
		
		
		

	}

}
