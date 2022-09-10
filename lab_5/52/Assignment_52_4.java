public class Assignment_52_4 {
    public static boolean prime_number(int num) {
        boolean prime_num = true;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                prime_num = false;
            }
        }
        return prime_num;
    }

    public static void array_prime(int n) {
        int length = 0;
        for (int x = 2; x < n; x++) {
            if (prime_number(x)) {
                length++;
            }
        }
        int[] arr_prime = new int[length];
        for (int x = 2, i = 0; x < n; x++) {
            if (prime_number(x)) {
                arr_prime[i] = x;
                System.out.println(arr_prime[i]);
                i++;
            }
        }
    }

    public static void main(String[] args) {
        array_prime(Integer.parseInt(args[0]));
    }

}
