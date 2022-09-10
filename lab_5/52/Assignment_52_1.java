public class Assignment_52_1 {
    
    public static int[] get_digits(int num) {
        int digits = 0;
        int num2 = num;
        while (num2 > 0) {
            num2 /= 10;
            digits++;
        }
        int[] arr = new int[digits];
        for (int i = 0; i < digits; i++) {
            arr[i] = num % 10;
            num /= 10;
        }
        return arr;
    }

    public static boolean palindrome(int[] array) {
        boolean is_palindrome = true;
        for (int i =0;i<array.length; i++){
            if (array[i]!=array[array.length-1-i]){
                is_palindrome = false;
                break;
            }
        }
        return is_palindrome;
    }

    public static void main(String[] args) {
        System.out.println(palindrome(get_digits(Integer.parseInt(args[0]))));
    }
}
