public class Assignment_43_2 {
    public static int[] factorials(int num) {
        int[] factorials = new int[num];
        for (int i = 0; i < num; i++) {
            factorials[i] = 1;
            for (int x = 1; x <= i; x++) {
                factorials[i] *= x;
            }
        }
        return factorials;
    }

    public static void print_the_factorials(String[] arr) {
        int num = Integer.parseInt(arr[0]);
        int[] factorials = factorials(num);
        System.out.println("The factorials are");
        for (int i=0;i< num;i++){
            System.out.println(i+"!"+" = "+factorials[i]);
        }
    }

    public static void main(String[] args) {
        print_the_factorials(args);
    }
}
