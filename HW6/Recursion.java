public class Recursion {
    // For Q8
    public static int steps = 0;

    public static void main(String[] args) {

    }

    public static int gcd(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return gcd(a - b, b);
        }
        return gcd(a, b - a);
    }

    public static String removeVowels(String str) {
        if (str.length() == 0) {
            return "";
        }
        if ("aeiouAEIOU".indexOf(str.charAt(0)) != -1) {
            return removeVowels(str.substring(1));
        }
        return str.charAt(0) + removeVowels(str.substring(1));
    }

    public static String convert(int num, int base) {
        if (num / base == 0) {
            return "" + num % base;
        }
        String temp = "" + num % base;
        num = num / base;
        return convert(num, base) + temp;
    }

    public static String camelcase(String sentence) {
        sentence = captializeWord(sentence, false);
        sentence = removeSpaces(sentence);
        return letterToLower(sentence.charAt(0)) + sentence.substring(1);
    }

    public static String removeSpaces(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(0) == ' ') {
            return removeSpaces(str.substring(1));
        }
        return str.charAt(0) + removeSpaces(str.substring(1));
    }

    public static String captializeWord(String str, boolean flag) {
        if (str.length() == 0) {
            return "";
        }
        if (!flag) {
            flag = isLetter(str.charAt(0));
            return letterToUpper(str.charAt(0)) + captializeWord(str.substring(1), flag);
        }
        flag = isLetter(str.charAt(0));
        return letterToLower(str.charAt(0)) + captializeWord(str.substring(1), flag);
    }

    private static char letterToUpper(char chr) {
        return ('a' <= chr && chr <= 'z') ? (char) (chr - ' ') : chr;
    }

    private static char letterToLower(char chr) {
        return ('A' <= chr && chr <= 'Z') ? (char) (chr + ' ') : chr;
    }

    private static boolean isLetter(char chr) {
        return ('a' <= chr && chr <= 'z') || ('A' <= chr && chr <= 'Z');
    }

    public static int sumArr(int[] arr) {
        return sumArray(arr, 0);
    }

    private static int sumArray(int[] arr, int n) {
        if (n == arr.length - 1) {
            return arr[n];
        }
        return arr[n] + sumArray(arr, n + 1);
    }

    public static int binarySearch(int[] sortedArr, int num) {
        return binarySearch(sortedArr, num, 0, sortedArr.length - 1);
    }

    private static int binarySearch(int[] sortedArr, int num, int beginIndex, int endIndex) {
        int mid = (beginIndex + endIndex) / 2;
        if (sortedArr[mid] == num) {
            return mid;
        }

        if (beginIndex >= endIndex) {
            return -1;
        }
        if (num > sortedArr[mid]) {
            return binarySearch(sortedArr, num, mid + 1, endIndex);

        }
        return binarySearch(sortedArr, num, beginIndex, mid - 1);
    }

    public static boolean isSubArr(int[] smaller, int[] bigger) {
        if (smaller.length > bigger.length) {
            return false;
        }
        return isSubarr(smaller, bigger, 0, 0);
    }

    public static boolean isSubarr(int[] smaller, int[] bigger, int smallerIndex, int biggerIndex) {
        if (smallerIndex == smaller.length) {
            return true;
        }
        if (biggerIndex == bigger.length) {
            return false;
        }
        if (smaller[smallerIndex] == bigger[biggerIndex]) {
            return isSubarr(smaller, bigger, smallerIndex + 1, biggerIndex + 1);
        }

        return isSubarr(smaller, bigger, smallerIndex, biggerIndex + 1);
    }

    public static void mainQuestion8() {
        // Put your testing code here. For example:
        int[][] a = { { 3, 4, 5 },
                { 2, 2, 0 },
                { 1, 0, 1 } };

        System.out.println(" Value of maximal path = " + maxVal(a));
        System.out.println(" Number of recursive steps = " + steps);
        steps = 0;
        System.out.println(" Value of maximal path = " + effMaxVal(a));
        System.out.println(" Number of recursive steps = " + steps);
    }

    // Returns the value of the maximal path in the given 2D array
    public static int maxVal(int[][] arr) {
        return maxVal(arr, 0, 0);
    }

    // Returns the value of the maximal path in the given 2D array, starting at
    // location (i,j)
    private static int maxVal(int[][] arr, int i, int j) {
        steps++;
        if (arr.length - 1 == i && arr[0].length - 1 == j) {
            return arr[i][j];
        }
        if (j == arr[0].length - 1) {
            return arr[i][j] + maxVal(arr, i + 1, j);
        }
        if (i == arr.length - 1) {
            return arr[i][j] + maxVal(arr, i, j + 1);
        }
        return arr[i][j] + Math.max(maxVal(arr, i + 1, j), maxVal(arr, i, j + 1));
    }

    // Returns the value of the maximal path in the given 2D array, efficiently.
    public static int effMaxVal(int[][] arr) {
        int[][] memo = new int[arr.length][arr[0].length];
        initializes(memo, 0);
        memo[arr.length - 1][arr[0].length - 1] = arr[arr.length - 1][arr[0].length - 1];
        effMaxVal(arr, memo, 0, 0);
        return memo[0][0];
    }

    private static void initializes(int[][] memo, int i) {
        if (i != memo.length) {
            initialminusOne(memo[i], 0);
            initializes(memo, i + 1);
        }
    }

    private static void initialminusOne(int[] temp, int i) {
        if (i != temp.length) {
            temp[i] = -1;
            initialminusOne(temp, i + 1);
        }
    }

    // Returns the value of the maximal path in the given 2D array, starting
    // at location (i,j), efficiently. By "efficiently" we mean as follows:
    // If the value was already computed, returns the value using memo.
    // Otherwise, computes the value, stores the value in memo,
    // and returns the value.
    // SIDE EFFECT: This function changes the contents of the given memo array.
    private static int effMaxVal(int[][] arr, int[][] memo, int i, int j) {
        steps++;
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        if (j == arr[0].length - 1) {
            memo[i][j] = arr[i][j] + effMaxVal(arr, memo, i + 1, j);
            return memo[i][j];
        }
        if (i == arr.length - 1) {
            memo[i][j] = arr[i][j] + effMaxVal(arr, memo, i, j + 1);
            return memo[i][j];
        }
        if (memo[i][j + 1] == -1 || memo[i + 1][j] == -1) {
            memo[i][j] = arr[i][j] + Math.max(effMaxVal(arr, memo, i, j + 1), effMaxVal(arr, memo, i + 1, j));
        }
        return memo[i][j];
    }
}
