package exercises;

public class WordUtilities {

	public static boolean isDigit(char ch) {
		// returns true if ch is a digit (one of 0123456789)
		if (Character.isDigit(ch)) {
			return true;
		} else {
			// and false otherwise
			return false;
		}
	}

	public static boolean isLetter(char ch) {
		// returns true if ch is a letter
		// i.e. one of abcdefghijklmnopqrstuvwxyz
		if (Character.isLetter(ch)) {
			return true;
		} else {
			// and false otherwise
			return false;
		}
	}

	public static boolean isVowel(char ch) {
		// returns true if ch is a vowel
		char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < vowels.length; i++) {
			if (Character.toLowerCase(ch) == vowels[i]) {
				return true;
			} else {
				continue;
			}

		}

		// and false otherwise
		return false;

	}
}
