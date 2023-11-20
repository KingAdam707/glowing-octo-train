package csc1025Practical6;
import java.util.Scanner;
public class PhotoArtClue {

	/**
	 * Program which will print a very basic verison of the Mona Lisa to demonstrate
	 * how 2D arrays are used to hold images
	 * 
	 * @param args
	 */
	public static void main(String[] args) {


		//<<-------------[DECLARATION AND INITIALISATION OF VARIABLES]--------->>

		int[][] photo = {

				{230,230,230,230,230,230,230,230,110,80,100,80,80,80,80,230,230,230,230,230,230,230,230,230,230,230}, 
				{230,230,230,230,230,230,110,80,80,100,80,80,80,80,80,80,80,200,230,230,230,230,230,230,230,230,230},
				{230,230,230,230,230,80,190,180,230,230,230,230,180,160,80,80,80,80,190,230,230,230,230,230,230,230},  
				{230,230,230,230,80,190,230,230,230,230,230,230,230,230,230,80,80,80,80,230,230,230,230,230,230,230},
				{230,230,230,190,80,180,190,190,230,170,170,180,160,160,80,80,80,190,230,230,230,230,230,230,230,230,230},
				{230,230,230,190,80,230,190,190,190,230,160,190,190,230,80,80,80,80,80,230,230,230,230,230,230,230},   
				{230,230,230,80,80,230,230,230,230,230,230,230,230,230,80,80,80,80,80,80,230,230,230,230,230,230},   
				{230,230,230,80,80,80,80230,180,180,190,230,230,160,160,80,80,80,80,80,230,230,230,230,230,230,230},
				{230,230,230,80,80,80,190,190,190,170,170,190,230,160,160,80,80,80,80,80,230,230,230,230,230,230,230}, 
				{230,230,230,80,80,80,80,80,71,180,180,160,160,160,160,160,80,80,80,80,230,230,230,230,230,230,230,230},
				{230,230,230190,190,80,80,73,80,80,80,230,160,160,160,160,80,80,80,80,190,230,230,230,230,230,230,230}, 
				{230,230,230,80,80,80,74,190,190,190,230,230,230,230,230,230,230,80,80,80,80,190,230,230,230,230,230,230}, 
				{230,230,80,80,80,75,230,230,230,230,230,230,230,230,230,230,230,190,190,80,80,80,190,190,230,230,230,230},   
				{230,190,80,73,100230,230,230,230,230,230,230,230,230,230,230,230,100,100,100,80,180,180,190,180,190,190},  
				{190,80,76,190,190,190,190,230,230,230,230,230,230,230,230,230,190,100,180,190,180,180,180,190,190,180},
				{230,230,230,230,190,190,190,190,160,160,170,170,170,200,200,180,230,230,230,230,170,230,230,180,180,200}
		};


		//<<-------------[PROGRAM OUTPUT]--------->>

		arraySpaced(photo);
		imageSpaced(photo);
		secretmessage(photo);
     
        
     

		//***INSERT NESTED IF CODE IN THIS AREA
		
		for (int i=0;i<photo.length;i++) {
			for (int j=0;j<photo[i].length;j++) {
				System.out.print(getAsciiChar(photo[i][j]));
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		//***INSERT NESTED IF CODE IN THIS AREA
		
		for (int i=0;i<photo.length;i++) {
			for (int j=0;j<photo[i].length;j++) {
				System.out.print(getAsciiCode(photo[i][j]));
			}
			System.out.println();
		}
	}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
	
	public static void arraySpaced(int photo[][]) {
		// Print the 2D array to the console using printf
        for (int[] row : photo) {
            for (int pixelValue : row) {
                System.out.printf("%4d ", pixelValue);
            }
            System.out.println();
        }
	}
	
	
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
	public static void imageSpaced(int photo[][]) {
		// Print the 2D array with ASCII characters using getImageChar method
        for (int[] row : photo) {
            for (int pixelValue : row) {
                System.out.print(getAsciiChar(pixelValue) + " ");
            }
            System.out.println();
        }
	}
	
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
	public static void secretmessage(int photo[][]) {
		// Print the 2D array with secret code characters using getCodeChar method
        for (int[] row : photo) {
            for (int pixelValue : row) {
                System.out.print(getAsciiCode(pixelValue) + " ");
            }
            System.out.println();
        }
	}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	
	
	
	/**
	 * Method to take a grayscale value and convert it into an ascii character
	 * @param greyscale 
	 * @return
	 */
	public static char getAsciiChar(int greyscale) {
		

		char asciiChar;

		//<<-------------[SELECT ASCII CHARACTER]--------->>


		if (greyscale >= 230.0) {
			asciiChar = '.';
		} else if (greyscale >= 200.0) {
			asciiChar = '.';
		} else if (greyscale >= 190.0) {
			asciiChar = '~';
		} else if (greyscale >= 170.0) {
			asciiChar = '=';
		} else if (greyscale >= 160.0) {
			asciiChar = ':';
		} else if (greyscale >= 130.0) {
			asciiChar = 'o';
		} else if (greyscale >= 100.0) {
			asciiChar = '%';
		} else if (greyscale >= 70.0) {
			asciiChar = '8';
		} else if (greyscale >= 50.0) {
			asciiChar = '#';
		} else {
			asciiChar = '@';
		}

		return asciiChar;


	}

	

	       

		



public static char getAsciiCode(int greyscale) {


char asciiChar = 0;


switch(greyscale){

 case 71: asciiChar= 'S';break;
 case 72: asciiChar= 'B';break;
 case 73: asciiChar= 'E';break;
 case 74: asciiChar= 'C';break;
 case 75: asciiChar= 'R';break;
 case 76: asciiChar= 'T';break;
 case 77: asciiChar= 'A';break;
 default: asciiChar= ' ';

}
return asciiChar;
}
}


