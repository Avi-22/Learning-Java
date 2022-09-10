public class Assignment_53_2 {
    public static boolean is_duplicate(int[] array, int num) {
        boolean duplicate = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                duplicate = true;
                break;
            }
        }
        return duplicate;
    }

    public static int[] unificatiion(int[] first, int[] second) {
        int cuont = 0, idex = 0;
        for (int i = 0; i < second.length; i++) {
            if (is_duplicate(first, second[i]) == false)
                cuont++;
        }
        int[] union = new int[first.length + cuont];
        for (int i = 0; i < second.length; i++) {
            if (is_duplicate(first, second[i]) == false) {
                union[idex] = second[i];
                idex++;
            }
        }
        for (int i = 0; i < first.length; i++) {
            union[i + cuont] = first[i];
        }
        return union;
    }

    public static void main(String[] args) {
        int[] first = { 1, 2, 3, 4 };
        int[] second = { 8, 2, 3, 9 };
        int[] union = unificatiion(first, second);
        for (int i = 0; i < union.length; i++) {
            System.out.print(union[i] + ", ");
        }

    }
}
