/** Represents an expression
 */
public class Expression {

	private static final char[] ops = {'+', '-', '*', ':', '>'};

    // The operands and operator of this expression
    private Fraction op1;
    private Fraction op2;
    private char op;
  
    /** Constructs an expression.
     *  @param numerator    can be signed
     *  @param denominator  can be signed
     */
    public Expression (Fraction f1, Fraction f2, char op) {
        op1 = f1;
        op2 = f2;
        this.op = op;
    }

    /** Constructs a random expression.
     *  A random expression consists of two random fractions, each with the given 
     *  limit, and a randomly selected operation which is either +, -, *, /, or >.
     *  @param limit must be at least 2
     */
    public Expression (int limit) {
       // Write your code here
    }

    /** Returns the first operand of this expression.
     *  @return the first operand of this expression (a fraction)
     */
    public Fraction getOp1() {
        return op1;
    }

    /** Returns the second operand of this expression.
     *  @return the second operand of this expression (a fraction)
     */
    public Fraction getOp2() {
        return op2;
    }

    /** Returns the operator of this expression.
     *  @return the second opetand of this expression (a fraction)
     */
    public char getOp() {
        return op;
    }

    /** Returns the value of this expression, as a fraction.
     *  If the operator (op) is '>', returns op1 minus op2, as a fraction.  
     *  @return the value of this expression, as fraction.
     */
    public Fraction value() {
        // Replace the following statement with your code
        return null;
    }

    /** Returns an expression that serves as a hint for this expression.
     *  Note: Multiplication expressions have no hints.
     *  @return an expression that has the same value as this expression
     */
    public Expression hint() {
        // Replace the following statement with your code
        return null;
    }

    /** Returns an expression that serves as a hint for solving this addition expression. 
     *  For example, the hint for 1/2 + 2/3 is 3/6 + 4/6.
     *  @return an expression that has the same value as this expression
     */
    public Expression addHint() {
         // Replace the following statement with your code
        return null;
    }

    /** Returns an expression that serves as a hint for solving this subtraction expression. 
     *  For example, the hint for 1/2 - 2/3 is 3/6 - 4/6.
     *  @return an expression that has the same value as this expression
     */
    public Expression subHint() {
         // Replace the following statement with your code
        return null;
    }

    /** Returns an expression that serves as a hint for solving this division expression. 
     *  For example, the hint for 1/2 : 2/3 is 1/2 * 3/2.
     *  @return a multiplication expression that has the same value as this expression
     */
    public Expression divHint() {
        // Replace the following statement with your code
        return null;
    }

    /** Returns an expression that serves as a hint for solving this comparison expression. 
     *  For example, the hint for 1/2 > 2/3 is 1/2 - 2/3.
     *  @return a subtraction expression
     */
    public Expression compHint() {
        // Replace the following statement with your code
        return null;
    }

    /** Returns a string representation of this expression.
     *  If the operand is negative, encloses the operand with parentheses.
     *  For example, if op1 = 1/5, op2 = -1/3, and op = "-", returns "1/5 - (-1/3)".
     *  @return a string representation of this expression.
     */
    public String toString () {
        // Replace the following statement with your code
        return null;
    }
}