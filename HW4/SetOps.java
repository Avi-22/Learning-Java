public class SetOps {
    public static void main(String[] args) {
        int arr[ ] = {1,2,3,4,1,2,1};
        System.out.println(uniqueElements(arr));
    }

    public static boolean is_duplicate(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static int[] arrayMinToMax(int arr[]) {
        int temp = arr[0];
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

    public static boolean contains(int[] array, int value) {
        boolean appears = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                appears = true;
                break;
            }
        }
        return appears;
    }

    public static boolean contains(int[] array, int value, int index) {
        boolean appears = false;
        for (int i = 0; i < index; i++) {
            if (array[i] == value) {
                appears = true;
                break;
            }
        }
        return appears;
    }

    public static int uniqueElements(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                count++;
            }
        }

        return count;
    }

    public static int[] buildSet(int[] array) {
        int build[] = new int[uniqueElements(array)];
        for (int i = 0, index = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                build[index] = array[i];
                index++;
            }
        }
        return build;
    }

    public static int[] unionSets(int[] array1, int[] array2) {
        int num = uniqueElements(array1) + uniqueElements(array2);
        int[] temp = new int[num];
        int[] new_arr1 = buildSet(array1);
        int[] new_arr2 = buildSet(array2);

        for (int i = 0; i < new_arr1.length; i++) {
            temp[i] = new_arr1[i];
        }
        for (int i = new_arr1.length; i < num; i++) {
            temp[i] = new_arr2[i - new_arr1.length];
        }
        int[] unionArr = new int[uniqueElements(temp)];
        unionArr = buildSet(temp);
        unionArr = arrayMinToMax(unionArr);
        return unionArr;
    }

    public static int[] intersectionSets(int[] array1, int[] array2) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (is_duplicate(array2, array1[i])) {
                count++;
            }
        }
        if (count == 0) {
            return new int[0];
        }
        int[] temp = new int[count];
        for (int i = 0, index = 0; i < array1.length; i++) {
            if (is_duplicate(array2, array1[i])) {
                temp[index] = array1[i];
                index++;
            }
        }
        int[] intersection = buildSet(temp);
        intersection = arrayMinToMax(intersection);
        return intersection;
    }

    public static int[] diffSets(int[] array1, int[] array2) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (!is_duplicate(array2, array1[i])) {
                count++;
            }
        }
        int[] temp = new int[count];
        for (int i = 0, index = 0; i < array1.length; i++) {
            if (!is_duplicate(array2, array1[i])) {
                temp[index] = array1[i];
                index++;
            }
        }
        int[] diffSets = buildSet(temp);
        diffSets = arrayMinToMax(diffSets);
        return diffSets;
    }

    public static int[] symDiffSets(int[] array1, int[] array2) {
        // Write your code here:
        return new int[1];
    }

}
