public class fourth {
/*
     * Assignment 4
A triangle is valid if the sum of lengths of any two sides is larger than the length of the third side.
For example, the sides with lengths 5, 7 and 10 form a valid triangle:
5 + 7 > 10 - Triangle A
7 + 10 > 5 - Triangle B
5 + 10 > 7 - Triangle C
However, three sides with lengths 1, 4, and 7 do not form a valid triangle since 1 + 4 < 7.
Write a program that, given 3 numbers representing the lengths of the three sides: a, b and c,
checks whether the sides can form a valid triangle.
If they can represent a valid triangle, print "Valid triangle". Otherwise, print "Invalid triangle".
For example, given the numbers 5, 7, 10, the program will print “Valid triangle”. However, given
the numbers 1, 4, 7 the program will print “Invalid triangle”.
     */
    
    public static void main(String[] args) {
        int A = 1;
        int B = 2;
        int C = 3;

        if((A+B)>C ){
            System.out.println("Valid triangle");
        }
        else {
            System.out.println("Invalid triangle");
        }
     
    }
}
