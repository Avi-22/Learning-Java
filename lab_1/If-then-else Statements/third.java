public class third {
    /*
     * Assignment 3
Given 2 numbers:
If the two numbers are equal, print “they are equal”.
Otherwise, if one of them is bigger than the other, print the larger of the two numbers.
For example, given the numbers 2 and 2 the program will print “they are equal”. Given the
numbers 2 and 3 the program will print “3”.
     */
    public static void main(String[] args) {

       int  first_num = 3;
       int  second_num =3;

       if(first_num==second_num){
        System.out.println("they are equal");
       } 
       else if (first_num>second_num){
        System.out.println(first_num);
       }

       else {
        System.out.println(second_num);
       }


    }
}
