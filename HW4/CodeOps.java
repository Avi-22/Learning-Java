// Represents some code operations as functions.-
public class CodeOps {
    public static void main(String args[]) {

    }

    public static int[] frequencies(String str) {
        str = StringOps.lowercase(StringOps.camelcase(str));
        int[] res = new int[26]; // Alphabet size.
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - 97;
            res[num]++;
        }
        return res;
    }

    public static void printHistogram(int[] letters) {
        for (int i = 0; i < 26; i++) {
            System.out.print((char) (97 + i) + ":");
            for (int j = 0; j <= letters[i] - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // assumption: the key is bigger or equal to -26
    public static String encode(String str, int key) {
        String encryption = "";
        str = StringOps.lowercase(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                char encode = (char) ((((str.charAt(i) + key) - 97) % 26) + 97);
                encryption += encode;
            } else {
                encryption += str.charAt(i);
            }

        }
        return encryption;
    }

    public static String decode(String str, int key) {
        String decryption = "";
        str = StringOps.lowercase(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                int decode = (str.charAt(i) - key - 97);
                decode = (decode < 0) ? ((decode + 26) % 26 + 97) : (decode % 26 + 97);
                decryption += (char) decode;

            } else {
                decryption += str.charAt(i);
            }

        }

        return decryption;
    }

    public static String decode(String str) {
        // Replace the return statement with your code.
        return "";
    }

}
