public class Assignment_52_3 {
    public static boolean prime_number(int num) {
        boolean prime_num = true;
        for (int i = 2; i <= num / 2 && prime_num; ++i) {
            if (num % i == 0) {
                prime_num = false;
            }
        }
        return prime_num;
    }
    public static void array_prime(int n) {
        int[] arr_prime = new int[n];
        int count = 0;

        for (int x = 2; x < n; x++) {
            if (prime_number(x)) {
                arr_prime[count] = x;
                count++;

            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(arr_prime[i]);
        }
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        array_prime(num);
    }
}
