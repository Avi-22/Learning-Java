public class teat {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 0, 0, 1, 1, 1, 1, 1 };
        System.out.println(binToDec(101));
        System.out.println(decToBin(5));
        System.out.println(d(arr));
    }

    public static String decToBin(int num) {
        String bin = "";
        while (num > 0) {
            bin += num % 2;
            num /= 2;
        }

        return bin;
    }

    public static int binToDec(long num) {
        long remainder = 0;
        int decimal = 0;
        int i = 0;
        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimal += remainder * Math.pow(2, i);
            i++;
        }

        return decimal;
    }

    public static String d(int[] arr) {
        String str = "";
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                count++;
            } else {
                str += count + ",";
                count = 1;
            }
        }

        
        str += count;
        return str;

    }

    public static int[] a(int[][] arr) {
        int[] all = new int[arr.length * arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                all[j + i * arr[0].length] = arr[i][j];

            }
        }

        return all;
    }
}
