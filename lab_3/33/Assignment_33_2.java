public class Assignment_33_2 {
    public static void fibonacci(int num) {
        int firs_num = 1, second_num = 1, third_num = 0;
        System.out.println(firs_num);
        System.out.println(second_num);
        for (int i = 3; i < num; i++) {
            if (firs_num+second_num>num){
                break;
            }
            third_num = firs_num + second_num;

            System.out.println(third_num);
            firs_num = second_num;
            second_num = third_num;
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        fibonacci(n);
    }
}
