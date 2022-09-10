public class Assignment_53_3 {
    public static boolean is_duplicate(int[] arr, int num) {
        boolean duplicate = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                duplicate = true;
                break;
            }
        }
        return duplicate;
    }

    public static int[] max_to_min(int[] array) {
        int[] max_2_min = new int[array.length];
        int max_num = array[0];

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (max_num < array[j]) {
                    max_num = array[j];
                    max_2_min[i] = array[j];
                }
            }
        }

        return max_2_min;
    }

    public static void main(String[] args) {
        int[] array = { 1, 4, 6, 88, 6, 99 };
        int[] max = max_to_min(array);
        for (int i = 0; i < max.length; i++) {
            System.out.print(max[i] + ", ");
        }
    }
}
