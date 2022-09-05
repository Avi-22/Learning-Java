public class Assignment_43_4 {
    public static int[] fibonacci(int num) {
        int[] fibonacci = new int[num];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
            for (int i = 2; i < num; i++) {
                fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
            }
        return fibonacci;
    }
    public static void print_user_choice(String n){
        int num = Integer.parseInt(n);
        int [] fibonacci = fibonacci(num);
        for (int i=0 ; i< fibonacci.length;i++){
            System.out.println(fibonacci[i]);
        }

    }

    public static void main(String[] args) {
        print_user_choice(args[0]);
    }
}

