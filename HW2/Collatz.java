// Demonstrates the Collatz conjecture. */
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		boolean verbose = args[1].equals("V") || args[1].equals("v");
		boolean concise = args[1].equals("C") || args[1].equals("c");

		for (int i = 1; i <= seed; i++) {
			int count = 1, temp = i;
			String hailstone = "" + temp;
			do {
				if (temp % 2 == 0) {
					temp /= 2;
					hailstone += " " + temp;
					count++;
				} else {
					temp = (temp * 3) + 1;
					hailstone += " " + temp;
					count++;
				}
			} while (temp != 1);
			if (verbose)
				System.out.println(hailstone + " (" + count + ")");
		}
		if (verbose || concise)
			System.out.println("The first " + seed + " hailstone sequences reached 1.");
	}
}
