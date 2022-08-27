public class Assignment_31_2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("n = " + n);
        for (int i = 1; i <= n; i++) {
            for (int x = 1; x <= n; x++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
