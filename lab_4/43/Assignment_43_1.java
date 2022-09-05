import java.util.Arrays;

public class Assignment_43_1 {
    public static int maximum_in_array(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = Math.max(array[i], max);
        }
        return max;
    }
    public static void user_output (String[] args){
        int[] array = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        System.out.println("The number are:");
        System.out.println(Arrays.toString(array));
        System.out.println("The maximum is: " + maximum_in_array(array));
    }

    public static void main(String[] args) {
      user_output(args);
    }
}
