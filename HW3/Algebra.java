
// Represents algebraic operations as functions.
public class Algebra {
	public static void main(String args[]) {
		// Some tests of the class functions
		System.out.println(plus(2, 3)); // 2 + 3
		System.out.println(minus(7, 2)); // 7 - 2
		System.out.println(times(3, 4)); // 3 * 4
		System.out.println(div(5, 3)); // 5 / 3
		System.out.println(div(3, 5)); // 3 / 5
		System.out.println(div(4, 4)); // 4 / 4
		System.out.println(div(14, 7)); // 14 / 7
		System.out.println(mod(5, 3)); // 5 % 3
		System.out.println(pow(5, 4)); // 5 ^ 4
		System.out.println(sqrt(36)); // sqrt(36)
		System.out.println(sqrt(76123)); // sqrt(76123)
		System.out.println(times(2, plus(4, 3))); // 2 * (4 + 3)
		int b = 5, c = 3;
		System.out.println(minus(pow(b, 2), times(4, c))); // b * b - 4 * c

	}

	// Returns x1 + x2.
	// Assumption: x1 and x2 are nonnegative.
	public static int plus(int x1, int x2) {
		for (int i = 0; i < x2; i++) {
			x1++;
		}
		return x1;
	}

	// Returns x1 - x2.
	// Assumption: x1 and x2 are nonnegative, and x1 >= x2.
	public static int minus(int x1, int x2) {
		for (int i = 0; i < x2; i++) {
			x1--;
		}
		return x1;
	}

	// Returns x1 * x2.
	// Assumption: x1 and x2 are nonnegative.
	public static int times(int x1, int x2) {
		if (x2 == 0) {
			return 0;
		} else {
			int temp = x1;
			for (int i = 1; i < x2; i++) {
				x1 = plus(temp, x1);
			}
		}
		return x1;
	}

	// Returns x^n.
	// Assumption: x and n are nonnegative.
	public static int pow(int x, int n) {
		if (n == 0) {
			return 1;
		} else {
			int temp = x;
			for (int i = 1; i < n; i++) {
				x = times(x, temp);
			}
		}
		return x;
	}

	// Returns x1 / x2 (integer division).
	// Assumption: x1 is nonnegative, x2 is positive.
	public static int div(int x1, int x2) {
		int count = 0;
		while (x1 >= x2) {
			x1 = minus(x1, x2);
			count++;
		}
		return count;
	}

	// Returns x1 % x2
	// Assumption: x1 is nonnegative, x2 is positive.
	public static int mod(int x1, int x2) {
		int temp = times(div(x1, x2), x2);
		return minus(x1, temp);
	}

	// Returns the integer part of sqrt(x)
	// Assumption: x >= 1.
	public static int sqrt(int x) {
		if (x == 1 || x == 0) {
			return x;
		} else {
			int guess = 0, l = 0, h = x;
			for (int i = 0; i < 100; i++) {
				int mid = plus(h, l);
				guess = div(mid, 2);
				if ((times(guess, guess)) == x) {
					return guess;
				} else if ((times(guess, guess)) < x) {
					l = guess;
				} else {
					h = guess;
				}
			}

			return guess;
		}

	}
}
