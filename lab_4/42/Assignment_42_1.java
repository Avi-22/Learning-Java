public class Assignment_42_1 {
    public static int random_with_range(int min, int max) {
        int range = max - min + 1;
        int random = (int) (Math.random() * range + min);
        return random;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        System.out.println(random_with_range(n, m));
    }
}
