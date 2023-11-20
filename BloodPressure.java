package csc1025Practical6;
import java.util.Arrays;
import java.util.Scanner;
public class BloodPressure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter How Many Readings: ");
		int numReadings = input.nextInt();
		int[] systolic = new int[numReadings];
		int[] diastolic = new int[numReadings];
		
		
		//Systolic Part
		int totalSystolic = 0;
		for(int i = 0; i<numReadings; i++) {
			System.out.printf("Systolic Reading %d: ",(i+1));
			int systolicReading = input.nextInt();
			totalSystolic += systolicReading;
			systolic[i]=systolicReading;
			System.out.println();
		}
		int avgSystolic = totalSystolic/numReadings;
		
		
		
		//Diastolic Part
		int totalDiastolic = 0;
		for (int i = 0; i < numReadings; i++) {
			System.out.printf("Diastolic Reading %d: ", (i + 1));
			int diastolicReading = input.nextInt();
			totalDiastolic += diastolicReading;
			diastolic[i]=diastolicReading;
			System.out.println();
		}
		int avgDiastolic = totalDiastolic/numReadings;
		
		System.out.print("Blood Pressure Category: ");
		if (avgSystolic<120 && avgDiastolic<80) {
			System.out.print("NORMAL");
		}else if ((avgSystolic>=120 && avgSystolic<=129) && avgDiastolic<80) {
			System.out.print("ELEVATED");
		}else if ((avgSystolic>=130 && avgSystolic<=139) || (avgDiastolic>=80 && avgDiastolic<=89)) {
			System.out.print("HIGH BLOOD PRESSURE (HYPERTENSION) STAGE 1");
		}else if ((avgSystolic>=140 && avgSystolic<=179) || (avgDiastolic>=90 && avgDiastolic<=119)) {
			System.out.print("HIGH BLOOD PRESSURE (HYPERTENSION) STAGE 2");
		}else if (avgSystolic>=180 && avgDiastolic>=120) {
			System.out.print("HIGH BLOOD PRESSURE (HYPERTENSION) STAGE 3");
		}else if (avgSystolic>=180 || avgDiastolic>=120) {
			System.out.print("HIGH BLOOD PRESSURE (HYPERTENSION) STAGE 3");
		}
		
		
	}

}
