
/***
 * you may only use the following String functions
 * 1. str.charAt(int i);
 * 2. str.length();
 * 3. str.substring(int start);
 * 4. str.substring(int start,int end);
 */
public class StringOps {
    public static void main(String[] args) {
    
    }

    public static String trim(String str, char ch) {
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                flag = true;
            }
        }
        if (flag) {
            while (str.charAt(0) == ch) {
                str = str.substring(1);
            }
            while (str.charAt(str.length() - 1) == ch) {
                str = str.substring(0, str.length() - 1);
            }
        } else {
            str = "";
        }

        return str;
    }

    public static int lastIndexOf(String str, char ch) {
        // Write your code here:
        return -1;
    }

    public static String toBinary(int x) {
        // Write your code here:
        return "";
    }

    public static String[] tokenize(String str) {
        boolean word = true;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                word = true;
            } else if (word) {
                count++;
                word = false;
            }
        }
        word = true;
        String[] arr = new String[count];
        str = str + " ";
        String temp = str;

        for (int i = 0, index = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                word = true;
            } else if (word) {
                word = false;
                temp = str.substring(i);
                arr[index] = temp.substring(0, temp.indexOf(' '));
                index++;
            }
        }
        return arr;
    }

    public static boolean capital_letter(char letter) {
        return (letter >= 'A' && letter <= 'Z');
    }

    public static boolean lowercase_letters(char letter) {
        return (letter >= 'a' && letter <= 'z');
    }

    public static int charRunCount(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                count++;
            }
        }

        return count;
    }

    public static String lowercase(String str) {
        String lower_case = "";
        for (int i = 0; i < str.length(); i++) {
            if (capital_letter(str.charAt(i))) {
                lower_case += (char) (str.charAt(i) + 32);
            } else {
                lower_case += str.charAt(i);
            }
        }
        return lower_case;
    }

    public static String camelcase(String str) {
        String c_case = "";
        boolean space_before = false;
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (letter == ' ') {
                space_before = true;
            } else if (capital_letter(letter) && space_before) {
                c_case += letter;
                space_before = false;
            } else if (lowercase_letters(letter) && space_before) {
                c_case += (char) (letter - 32);
                space_before = false;
            } else if (capital_letter(letter)) {
                c_case += (char) (letter + 32);
            } else if (lowercase_letters(letter)) {
                c_case += letter;
            }
        }
        if (capital_letter(c_case.charAt(0))) {
            c_case = "" + ((char) (c_case.charAt(0) + 32)) + c_case.substring(1);
        }
        return c_case;
    }

    public static int compareTo(String str1, String str2) {
        str1 = lowercase(str1);
        str2 = lowercase(str2);
        int output = 0;
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) > str2.charAt(i)) {
                    output = 1;
                    break;
                } else if (str1.charAt(i) < str2.charAt(i)) {
                    output = -1;
                    break;
                }
            }
        } else {
            int min = Math.min(str1.length(), str2.length());
            for (int i = 0; i < min; i++) {
                if (str1.charAt(i) > str2.charAt(i)) {
                    return 1;
                } else if (str1.charAt(i) < str2.charAt(i)) {
                    return -1;
                }
            }
        }
        if ((output == 0 && str1.length() > str2.length())) {
            output = 1;
        } else if (str1.length() < str2.length()) {
            output = -1;
        }
        return output;
    }

    public static int stringToInt(String str) {
        int index = 0;
        int num = 0;
        boolean negative = false;
        if (str.charAt(0) == '+') {
            index = 1;

        } else if (str.charAt(0) == '-') {
            index = 1;
            negative = true;
        }
        for (; index < str.length(); index++) {
            num += (str.charAt(index) - 48) * (int) Math.pow(10, str.length() - 1 - index);
        }
        return num = ((negative) ? -num : num);
    }

    public static String expand(String str) {
        char letter = str.charAt(0);
        String expand = "", int_letter = "";
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                if (int_letter.length() > 0) {
                    for (int j = 0; j < stringToInt(int_letter); j++) {
                        expand += letter;
                    }
                    int_letter = "";
                }
                letter = str.charAt(i);
            } else {
                int_letter += str.charAt(i);
            }
        }
        for (int j = 0; j < stringToInt(int_letter); j++) {
            expand += letter;
        }
        return expand;
    }

}
