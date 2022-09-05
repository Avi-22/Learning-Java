public class Assignment_32_4 {
    public static void number_of_words_in_string(String str) {
        int length = str.length();
        int num_of_words = 1;
        for (int i = 1; i <= length; i++) {
            if (str.charAt(i-1) == ' ') {
                num_of_words++;
            }
        }
        System.out.println(num_of_words);
    }

    public static void main(String[] args) {
        number_of_words_in_string(args[0]);
    }
}
