
// A collection of functions for handling anagrams.
public class Anagram {
	public static void main(String args[]) {
		// Tests the isAnagram function.
		System.out.println(isAnagram("silent", "listen")); // true
		System.out.println(isAnagram("William Shakespeare", "I am a weakish"));
		// speller")); // true
		System.out.println(isAnagram("Madam Curie", "Radium came")); // true
		// Tests the randomAnagram function.
		System.out.println(randomAnagram("silent")); // Prints a random anagram
		// Performs a stress test of randomAnagram
		boolean pass = true;
		String str = "this is a stress test";
		for (int i = 0; i < 1000; i++) {
			pass = pass && isAnagram(str, randomAnagram(str));
		}
		System.out.println(pass); // true if all tests are positive
	}

	// Returns true if the two given strings are anagrams, false otherwise.
	public static boolean isAnagram(String str1, String str2) {
		str1 = preProcess(str1);
		str2 = preProcess(str2);
		int first = 0, second = 0;
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				first += str1.charAt(i);
				second += str2.charAt(i);
			}
			if (first == second) {
				return true;
			}
		}

		return false;
	}

	// Returns a preprocessed version of the given string: all the letter characters
	// are converted to lower-case, and all the other characters are deleted. For
	// example,
	// the string "What? No way!" becomes "whatnoway"
	public static String preProcess(String str) {
		String lower_case = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				lower_case += (char) (str.charAt(i) + 32);
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				lower_case += str.charAt(i);
			}
		}
		return lower_case;
	}

	// Returns a random anagram of the given string. The random anagram consists of
	// the same
	// letter characters as the given string, arranged in a random order.
	public static String randomAnagram(String str) {
		str = preProcess(str);
		String new_str = "";
		String index_1_0 = "";

		for (int i = 0; i < str.length(); i++) {
			index_1_0 += "0";
		}
		while (true) {
			if (new_str.length() == str.length()) {
				return new_str;
			} else {
				int num = (int) (Math.random() * str.length());
				char letter = str.charAt(num);
				if (new_str.indexOf(letter) == -1) {
					new_str += letter;
					if (num >= 0 && num < index_1_0.length()) {
						index_1_0 = index_1_0.substring(0, num) + "1" + index_1_0.substring(num + 1);
					} else {
						index_1_0 = index_1_0.substring(0, num - 1) + "1";
					}

				} else if (index_1_0.charAt(num) == '0') {
					new_str += letter;
					if (num >= 0 && num < index_1_0.length()) {
						index_1_0 = index_1_0.substring(0, num) + "1" + index_1_0.substring(num + 1);
					} else {
						index_1_0 = index_1_0.substring(0, num - 1) + "1";
					}
				}
			}
		}
	}

}
