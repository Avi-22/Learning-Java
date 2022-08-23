import javax.sql.rowset.spi.SyncResolver;

public class Assignement_22_3 {
    public static void main(String[] args) {
        int num, sum, first_digit, second_digit, third_digit, largest_digit, middle_digit, lowest_digit;
        num = Integer.parseInt(args[0]);
        first_digit = (num - num % 10) / 100;
        second_digit = (num % 100) / 10;
        third_digit = num % 10;
        sum = first_digit + second_digit + third_digit;
        double average = (double) sum / 3;

       largest_digit = Math.max((Math.max(first_digit, second_digit)),third_digit);
       lowest_digit = Math.min((Math.min(first_digit,second_digit)),third_digit);
       middle_digit = sum- largest_digit-lowest_digit;

        
        System.out.println(sum);
        System.out.println("Average of all digits" + average);
        System.out.println("Largest digit is: " + largest_digit);
        System.out.println("Middle digit is: " + middle_digit);
        System.out.println("Lowest digit is: " + lowest_digit);

    }
}
