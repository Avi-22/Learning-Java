import java.util.Arrays;

public class Assignment_43_3 {
    public static void main(String[] args) {
        int[] array = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        int num =array[0];
        boolean no_pairs = true;

        for (int i = 1; i < array.length; i++) {
            for (int x = i; x < array.length; x++) {
                if (array[i] + array[x] == num) {
                    no_pairs = false;
                    System.out.print("(" + array[i] + "," + array[x] + ") ");
                }
            }
        }
        if (no_pairs) {
            System.out.println("No pairs");
        }
    }
}
