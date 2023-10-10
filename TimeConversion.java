package csc1025.prac2.part2;

public class TimeConversion {

	public static void main(String[] args) {
		
		
		
		int totalSeconds = 5000;
		
		int finalSeconds;
		int finalMinutes;
		int finalHours;
		
		
		
		finalHours = totalSeconds / 3600;
		
		finalMinutes =(totalSeconds % 3600) / 60;
		
		finalSeconds = totalSeconds % 60;
		

		
		//System.out.println(finalMinutes);
		//System.out.println(finalHours);
		//System.out.println(finalSeconds);
		
		
		
		
		System.out.println(finalHours + " Hours " + finalMinutes + " Minutes " + finalSeconds + " Seconds " );
		System.out.print(finalHours + ":" + finalMinutes + ":" + finalSeconds);
		
		

	}

}
