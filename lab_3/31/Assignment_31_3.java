public class Assignment_31_3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            for (int y = 1; y <= i; y++) {
                System.out.print(y);

            }
            System.out.println();
        }

    }
}
