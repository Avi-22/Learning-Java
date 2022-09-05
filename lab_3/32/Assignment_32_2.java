public class Assignment_32_2 {
    public static void printSmiley(int num) {
        String[] smiley = { " ", ":-)", ";-)", ":-/", ":-(" };
        System.out.println(smiley[num]);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        printSmiley(n);
    }

}
