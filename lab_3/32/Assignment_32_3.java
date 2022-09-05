public class Assignment_32_3 {
    public static boolean prime_number(int num) {
        boolean prime_num = true;
        for (int i = 2; i < num/2 && prime_num; i++) {
            if (num % i == 0) {
                prime_num = false;
            }
        }
        return prime_num;

    }

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        for (int i = 2; i <= number; i++) {
            if (prime_number(i)){
                System.out.println(i);

            }

        }

    }
}
