public class Assignment_53_1 {
    public static int[] return_array(int[] first, int[] second) {
        int length = 0;
        int[] middle_arr = new int[first.length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first.length; j++) {
                if (first[i] == second[j]) {
                    middle_arr[length] = second[j];
                    length++;
                    break;
                }
            }
        }
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = middle_arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] first = { 4, 8, 10 ,16};
        int[] second = {16, 8, 4, 12};
        int[] same = return_array(first, second);
        for (int i = 0; i < same.length; i++)
            System.out.println(same[i]);
    }
}
