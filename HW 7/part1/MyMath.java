/**
 * A library of commonly used mathematical operations.
 */
public class MyMath {

    // For each one of the three method names listed below,
    // write the method signature, document the method,
    // and write its implementation.
    // The documentation should be done in JavaDoc.
    // Use the same documentation style we used in Fraction.java.

    /**
     * Returns the greatest common divisor of two positive numbers.
     * Uses Euclid's algorithm.
     */
    public static int gcd(int x, int y) {

        while (y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return x;
    }

    /** commonDenominator */
    public static int commonDenominator(Fraction first, Fraction second) {
        int d1 = first.getDenominator();
        int d2 = second.getDenominator();
        if (d1 % d2 == 0) {
            return d1;
        }
        if (d2 % d1 == 0) {
            return d2;
        }
        return d1 * d2;
    }

    public static Fraction max(Fraction first, Fraction second) {
        if (first.subtract(second).signum() == 1) {
            return first;
        }
        return second;
    }
    /** max */
}