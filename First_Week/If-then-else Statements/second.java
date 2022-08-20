public class second {
    
       /* 
         Assignment 2
    Given a number (integer):
    • If the number is outside of the range 0-100 inclusive, print "WOW".
    • Otherwise, if it is a power of 10, print "SUCH POWER".
    • Otherwise, if is a multiple of 7, print "MUCH LUCK".
    • Otherwise, print "VERY CODE".

    For example, for the number 49 the program will print “MUCH LUCK”.
    For the number 101 the program will print “WOW”.
        */
    /**
     * @param args
     */
    public static void main(String[] args) {
        int number = 49;

        boolean out_of_range_0_100 = number>100 || number<0;
        boolean power_of_10 = number ==10 || number ==100 || number ==1;
        boolean multiple_of_7 = number%7==0;



        if (out_of_range_0_100){
            System.out.println("WOW");
        }

        else if (power_of_10){
            System.out.println("SUCH POWER");
        }
        
        else if (multiple_of_7){
            System.out.println("MUCH LUCK");
        }

        else{
            System.out.println("VERY CODE");
        }
    }
}
