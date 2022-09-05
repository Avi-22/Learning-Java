public class Assignment_33_3 {
    public static void fibonacci(int num) {
        int firs_num = 1, second_num = 1, third_num = 0;
        if (num == 0 || num == 1) {
            System.out.println("1");
        } else {
            for (int i = 2; i <= num; i++) {
                third_num = firs_num + second_num;
                firs_num = second_num;
                second_num = third_num;
            }
            System.out.println(third_num);
        }

    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        fibonacci(n);
    }

}
