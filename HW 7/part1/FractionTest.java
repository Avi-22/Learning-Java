/**
 * Tests the Fraction and MyMath methods described in Homework 8.
 */
public class FractionTest {

    // Some representative Fraction objects, used in the various tests written in
    // this class.
    static Fraction half = new Fraction(1, 2);
    static Fraction minusHalf = new Fraction(-1, 2);
    static Fraction quarter = new Fraction(1, 4);
    static Fraction minusQuarter = new Fraction(-1, 4);
    static Fraction third = new Fraction(1, 3);
    static Fraction twoThirds = new Fraction(2, 3);
    static Fraction zero = new Fraction(0, 1);

    public static void main(String args[]) {
        // testFraction();
        // testAbs();
        // testSignum();
        // testConvert();
        // testSubtract();
        // testCompareTo();
        // testEquals();
        // testPow();
        // testRandomFraction();
        testCommonDenominator();
        testMax();
    }

    private static void testFraction() {
        // Use this function for writing code that creates and manipulates Fraction
        // objects.
        // You can use the static Fraction objects declared above, but make sure to
        // practice
        // creating some Fraction objects of your own.
    }

    private static void testAbs() {
        System.out.println("Testing the abs function:");
        System.out.println("abs(" + half + ") = " + half.abs());
        // Complete the testing code here.
    }

    private static void testSignum() {
        System.out.println("Testing the Signum function:");
        System.out.println("Signum(" + half + ") = " + half.signum());
    }

    private static void testConvert() {
        System.out.println("Testing the Convert function:");
        System.out.println("Signum(" + half + ") = " + half.convert());
    }

    private static void testSubtract() {
        System.out.println("Testing the Subtract function:");
        System.out.println("Subtract(" + quarter + " " + half + ") = " + quarter.subtract(half));
    }

    private static void testCompareTo() {
        System.out.println("Testing the CompareTo function:");
        System.out.println("CompareTo(" + quarter + " " + half + ") = " + quarter.compareTo(half));
    }

    private static void testEquals() {
        System.out.println("Testing the Equals function:");
        System.out.println("Equals(" + quarter + " " + half + ") = " + quarter.equals(half));
    }

    private static void testPow() {
        System.out.println("Testing the Pow function:");
        System.out.println("Pow(" + twoThirds + ")^3 = " + twoThirds.pow(3));
    }

    private static void testRandomFraction() {
        System.out.println("Testing the RandomFraction function:");
        for (int i = 0; i < 10; i++) {
            System.out.println("(" + new Fraction((int) (Math.random() * 100) + 2) + ")");
        }
    }

    private static void testCommonDenominator() {
        System.out.println("Testing the CommonDenominator function:");
        System.out.println("(" + twoThirds + ", " + quarter + ") " + MyMath.commonDenominator(quarter, third));

    }

    private static void testMax() {
        System.out.println("Testing the testMax function:");
        System.out.println("(" + twoThirds + ", " + quarter + ") " + MyMath.max(quarter, twoThirds));
    }
}