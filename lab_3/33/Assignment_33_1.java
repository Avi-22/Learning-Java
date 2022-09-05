public class Assignment_33_1 {
    public static boolean PrefectNumber(int num) {
        boolean prefect_num = false;
        int sum= 0;
        for (int i = 1 ; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
                
                
            }

        }
        if (sum == num) {
            prefect_num = true;
        }
        return prefect_num;
    }

    public static void main(String[] args) {

        for (int x = 1; x < 1000; x++) {
            if (PrefectNumber(x)) {
                System.out.println(x + " perfect number");
            }
        }
    }
}
