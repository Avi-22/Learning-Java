public class Assignment_41_3 {
    public static int count_number(int num) {
        int first_digit = (num - num % 10) / 10;
        int secund_digit = num % 10;
        if (first_digit + secund_digit == 7 || first_digit + secund_digit == 9) {
            return num;
        } 
        return -1;

    }
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            if (count_number(i) > 10) {
                System.out.println(count_number(i));
            }
        }
    }
}