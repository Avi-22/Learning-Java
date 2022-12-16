
public class ArrayOps {
    public static void main(String[] args) {

    }

    public static int[] arrayMinToMax(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static boolean isSorted(int[] array) {
        boolean minToMax = true;
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < temp) {
                minToMax = false;
                break;
            }
            temp = array[i];
        }
        return minToMax;
    }

    public static int bruteForce(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;

    }

    public static int binarySerach(int[] array, int value) {
        // Write your code here:
        return -1;

    }

    public static int secondMaxValue(int[] array) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        temp = arrayMinToMax(temp);
        return temp[temp.length - 2];
    }

    public static int findMissingInt(int[] array) {
        int val = 0;
        array = arrayMinToMax(array);
        if (array[0] == 0) {
            val = 1;
        }
        boolean missInt = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i) {
                val = i;
                missInt = false;
                break;
            }

        }
        if (missInt) {
            val = array[array.length - 1] + 1;
        }

        return val;
    }

    public static int[] merge(int[] array1, int[] array2) {
        int n = array1.length + array2.length;
        int merge_arr[] = new int[n];
        for (int i = 0; i < array1.length; i++) {
            merge_arr[i] = array1[i];
        }
        for (int i = array1.length; i < n; i++) {
            merge_arr[i] = array2[i - array1.length];
        }
        merge_arr = arrayMinToMax(merge_arr);
        return merge_arr;
    }

}
