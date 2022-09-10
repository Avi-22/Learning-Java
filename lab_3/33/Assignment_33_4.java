public class Assignment_33_4 {
    public static boolean palindrome(String word) {
        boolean palindrome = false;
        int length = word.length();
        String str= "";

        for (char letter; length >= 1; length--) {
            letter = word.charAt(length -1);
            str +=letter; 
        }
        if (word.equals(str)){
            palindrome =true;
        }
        return palindrome;
    }

    public static void main(String[] args) {
        System.out.println(palindrome(args[0]));
    
    }
}
