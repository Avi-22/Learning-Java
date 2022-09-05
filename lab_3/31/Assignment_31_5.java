public class Assignment_31_5 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            for (int y = 1; y<=n-i; y++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= i; y++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
