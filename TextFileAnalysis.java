package csc1025.prac7;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class TextFileAnalysis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line;
		try {
			File file = new File("sample.txt");
			FileReader fileReader = new FileReader(file.getName());
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			line = bufferedReader.readLine();
			String[] words = line.split("\\s+");
			int total = 0;
			String longestWord = "";
			String shortestWord = "abcdefghijklmnopqrstuvwxyz";
			int countOverall = 0;
			int countLine = 0;
			int avgWordLength = 0;

			do{
				countLine++;
				int count = 0;
				//removes puunctuation + finds avg word length
				for (int i = 0;i<words.length; i++) {
					words[i] = removePunctuation(words[i]);
					count +=(words[i].length());
				}
				
				
				//finds avg word length
				countOverall += (count/words.length);
				avgWordLength = countOverall / countLine;
				
				
				//longest word
				for (String array : words) {
					for (String word : words) {
						if (word.length() > longestWord.length()) {
		                    longestWord = word;
					}
					
				}
			}
					
				//shortest word
				for (String array : words) {
		            for (String word : words) {
		                if (word.length() < shortestWord.length()) {
		                    shortestWord = word;
		                }
		            }
				}
					
				
				
				
				//total word in txt	
				total += words.length;
				
				
				System.out.println(Arrays.toString(words));
				line = bufferedReader.readLine();
				if (line == null) {
					break;
				}
				
				words = line.split("\\s+");
				
			}while (line != null); 
			
			bufferedReader.close();
			fileReader.close();
			
			
			//writing to new stats file
			File fileWrite = new File("sampleStats.txt");
			FileWriter fw = new FileWriter(fileWrite, false);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Number of words in the file : " + total + "\n");
			bw.write("Average word length in file : " + avgWordLength + "\n");
			bw.write("Longest word length in file : " + longestWord.length() + "\n");
			bw.write("Shortest word length in file: " + shortestWord.length()+ "\n");
			
			
			
			bw.close();
			System.out.println("Write Complete...");
			
			
			

			
		}catch (IOException e) {
			e.printStackTrace();
		}
}
	
	private static String removePunctuation(String input) {
		// Use regular expression to remove non-letter characters
		return input.replaceAll("[^a-zA-Z]", "");
		}

}
