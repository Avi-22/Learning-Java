public class Assignment_31_6 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int num_of_space = 1;
        for (int i = 0; i < n; n--) {
            for (int y = n; y > 0; y--) {
                System.out.print(y);
            }
            for (int y = 1; y <= i + num_of_space; y++) {
                System.out.print(" ");
            }
            num_of_space+=2;

            for (int y = 1; y <= n; y++) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
