package exercises;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a line of text: ");
		String data = input.nextLine();
		// Extract one character at a time
		for (int index = 0; index < data.length(); index++) {
			char ch = data.charAt(index);
			processCharacter(ch);
		}
		input.close();
	}

	public static void processCharacter(char ch) {
		System.out.print("Character: " + ch);
		if (WordUtilities.isDigit(ch)) {
			System.out.println(" is a digit.");
		} else if (WordUtilities.isLetter(ch)) {
			System.out.print(" is a letter");
			if (WordUtilities.isVowel(ch)) {
				System.out.println(" and is also a vowel.");
			} else {
				System.out.println(" and is a consonant.");
			}
		} else {
			System.out.println(" is not a digit or letter.");
		}
	}
}
