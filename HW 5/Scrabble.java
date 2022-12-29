
/*
 * A version of the Scrabble game.
 */
public class Scrabble {

	// Note: "Class variables", like the following five class-level variables,
	// are global variables that can be accessed by all the functions in the class.
	// It is customary to name class variables using capital letters and underline
	// characters. If a variable is "final", it means that it is treated as a
	// constant value which is declared once and cannot changed later.

	// Name of the dictionary file:
	static final String WORDS_FILE = "dictionary.txt";

	// Number of words in the dictionary file (assumed to be at most 100,000):
	static int NUM_OF_WORDS;

	// The dictionary array (will be read from the dictionary file)
	static String[] DICTIONARY = new String[100000];

	// The "Scrabble value" of each letter in the English alphabet
	static final int[] SCRABBLE_LETTER_VALUES = { 1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3,
			1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10 };

	// The hand size (number of random letters dealt at each round of the Scrabble
	// game):
	static int HAND_SIZE = 10;

	/**
	 * Initializes the game by performing the following SIDE EFFECTS:
	 * 1. Populates the DICTIONARY array with all the words found in the WORDS_FILE.
	 * Each word is stored in its lowercase version.
	 * 2. Sets NUM_OF_WORDS to the number of words found in the file.
	 * 3. Sets standard input to the keyboard.
	 */
	public static void init() {
		// Sets the standard input stream to the given word file
		StdIn.setInput(WORDS_FILE);
		System.out.println("Loading word list from file...");
		// Reads all the words from the file into the DICTIONARY array
		// Put your code here.
		int index = 0;
		while (!StdIn.isEmpty()) {
			DICTIONARY[index] = StdIn.readString().toLowerCase();
			index++;
		}
		NUM_OF_WORDS = index;

		System.out.println(NUM_OF_WORDS + " words loaded.");
		// Sets the standard input stream to the keyboard, to allow interaction with the
		// user.
		StdIn.setInput("keyboard");
	}

	/**
	 * Returns the Scrabble score of a given word.
	 * The score of a word is the sum of the points of the letters in the word,
	 * multiplied by the length of the word, plus 50 points if the length of the
	 * word is n.
	 * 
	 * @param word - a lowercase string of letters
	 * @param n    - a given integer
	 * @return - the Scrabble value of the word
	 */
	public static int getWordScore(String word, int n) {
		int sum = 0;
		for (int i = 0; i < word.length(); i++) {
			sum += SCRABBLE_LETTER_VALUES[word.charAt(i) - 97];
		}
		sum *= word.length();
		sum = (word.length() == n) ? sum + 50 : sum;
		return sum;
	}

	/**
	 * Runs a single hand in a Scrabble game. The hand starts with n letters.
	 * 
	 * @param hand - the hand
	 */
	public static void playHand(String hand) {
		int score = 0;
		int length = hand.length();

		while (length > 0) {
			System.out.println("Current Hand: " + MyString.spacedString(hand));
			System.out.println("Enter a word, or '.' to finish this hand:");
			String input = StdIn.readString();
			if (input.equals(".")) {
				break;
			} else if (!MyString.subsetOf(input, hand)) {
				System.out.println("Invalid word. Try again.");
			} else if (!isWordInDictionary(input)) {
				System.out.println("No such word in the dictionary. Try again.");
			} else {
				score += getWordScore(input, length);
				System.out.println(input + " earned " + getWordScore(input, length) + " Total: " + score + " points");
				hand = MyString.remove(hand, input);
				length = hand.length();
			}
			System.out.println();
		}

		if (length == 0) {
			System.out.println("Run out of letters. Total: " + score + " points.");
		} else {
			System.out.println("End of hand" + " Total: " + score + " points");
		}

	}

	/**
	 * Initializes the game, and then allows the user to play an arbitrary number of
	 * hands.
	 * 
	 * 1) Asks the user to input 'n' or 'r' or 'e'.
	 * - If the user inputs 'n', lets the user play a new (random) hand.
	 * - If the user inputs 'r', lets the user play the last hand again
	 * (works only if this is not the first hand).
	 * - If the user inputs 'e', exits the game.
	 * - If the user inputs anything else, writes that the input is invalid.
	 *
	 * 2) When the user is done playing the hand, repeats from step 1.
	 */
	public static void playGame() {
		init();
		String word = "";
		String input = "";
		boolean e = true;
		while (e) {
			System.out.println("Enter n to deal a new hand, r to replay the last hand, or e to end game:");
			input = StdIn.readString();
			switch (input) {
				case "n":
					word = MyString.randomStringOfLetters(HAND_SIZE);
					playHand(word);
					break;
				case "r":
					if (word.length() == 0) {
						System.out.println("You have not play yet. Please play a new hand first!");
					} else {
						playHand(word);
					}
					break;
				case "e":
					e = false;
					break;
				default:
					System.out.println("Invalid input");
					break;
			}
		}
	}

	// Checks if the given word is in the given dictionary.
	private static boolean isWordInDictionary(String word) {
		for (int i = 0; i < NUM_OF_WORDS; i++) {
			if (DICTIONARY[i].equals(word))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// testPlayHand();
		playGame();

	}

	public static void testPlayHand() {
		playHand("pzuttto");
		playHand("aqwffip");
		playHand("aretiin");
	}
}
