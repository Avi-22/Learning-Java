public class Recursion {
    public static void main(String[] args) {
        anagram("knee", "keen");
    }
    


    // public static long factorial(int n) {
    // if (n <= -1) {
    // return -1;
    // }
    // if (n <= 1) {
    // return 1;
    // }
    // long res = n * factorial(n - 1);
    // return res;
    // }


   
    // public static int fibo2(int n) {
    // if (n == 0 || n == 1) {
    // return n;
    // }
    // return fibo2(n-1) + fibo2(n-2);
    // }


    // public static boolean stringEquals(String str1,String str2) {
    // if (str1.length() != str2.length()) {
    // return false;
    // }
    // if (str1.length() == 0) {
    // return true;
    // }
    // if (str1.charAt(0) != str2.charAt(0)) {
    // return false;
    // }
    // return stringEquals(str1.substring(1),str2.substring(1));
    // }


    // public static boolean isPalindrome(String str1) {
    // if (str1.length() <= 1) {
    // return true;
    // }
    // if (str1.charAt(0) != str1.charAt(str1.length() - 1)) {
    // return false;
    // }
    // return isPalindrome(str1.substring(1,str1.length() - 1));
    // }


    // public static int indexOf (String str, char ch) {
    // int res = indexOfHelper(str,ch);
    // if (res == str.length()) {
    // return -1;
    // }
    // return res;
    // }
    // private static int indexOfHelper (String str, char ch) {
    // if (str.length() == 0 || str.charAt(0) == ch) {
    // return 0;
    // }
    // return 1 + indexOfHelper(str.substring(1), ch);
    // }


    // public static int stringToInt(String num) {
    // if (num.length() == 0) {
    // return 0;
    // }
    // int number = (int) (Math.pow(10,num.length() - 1) * (num.charAt(0) - '0'));
    // return stringToInt(num.substring(1)) + number;
    // }


    public static boolean anagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        if (str1.length() == 0) {
            return true;
        }
        int index = str2.indexOf(str1.charAt(0));
        if (index == -1) {
            return false;
        }
        String temp = str2.substring(0, index);
        if (index != str2.length() - 1) {
            temp = str2.substring(0, index) + str2.substring(index + 1);
        }
        return anagram(str1.substring(1), temp);
    }


    public static int maxValue(int[] arr) {
        int maxIndex = maxValueHelper(arr, 0, 0);
        return arr[maxIndex];
    }

    private static int maxValueHelper(int[] arr, int curMaxIndex, int curIndex) {
        if (curIndex == arr.length) {
            return curMaxIndex;
        }
        if (arr[curMaxIndex] < arr[curIndex]) {
            return maxValueHelper(arr, curIndex, curIndex + 1);
        }
        return maxValueHelper(arr, curMaxIndex, curIndex + 1);
    }



    // Q1 (0:05-0:07)
    public static int charRunCount (String str, char ch){
        if (str.length() == 0){
            return 0;
        }
        if (str.charAt(0) == ch){
            return 1 + charRunCount(str.substring(1), ch);
        }
        return charRunCount(str.substring(1), ch);
    }

    //Q2 (0:07-0:10)
    public static int hammingDistance (String str1, String str2){
        if (str1.length() != str2.length()){
            return -1;
        }
        if (str1.length() == 0){
            return 0;
        }
        if (str1.charAt(0) != str2.charAt(0)){
            return 1 + hammingDistance(str1.substring(1), str2.substring(1));
        }
        return hammingDistance(str1.substring(1), str2.substring(1));
    }

    // Q3 (0:10 - 0:15)
    public static int[] reverseArray(int[] arr, int start, int end) {
        // base case: if the start and end indices have crossed, return the array
        if (start >= end) {
            return arr;
        }
        
        // swap the elements at the start and end indices
        swap(arr, start, end);
        
        // recursively reverse the rest of the array
        return reverseArray(arr, start + 1, end - 1);
    }
    
    private static void swap (int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Q4 (0:15 - 0:20)
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        // create a new array to store the merged elements
        int[] merged = new int[arr1.length + arr2.length];
        
        // merge the arrays
        mergeArrays(arr1, arr2, 0, 0, merged);
        
        // return the merged array
        return merged;
    }

    private static int[] mergeArrays(int[] arr1, int[] arr2, int index1, int index2, int[] merged) {
        // base case: if one of the arrays is empty, return the other array
        if (index1 >= arr1.length) {
            copyArray(arr2, merged, index2, index1 + index2);
            return merged;
        }
        if (index2 >= arr2.length) {
            copyArray(arr1, merged, index1, index1 + index2);
            return merged;
        }
        // add the smaller element to the merged array
        if (arr1[index1] < arr2[index2]) {
            merged[index1 + index2] = arr1[index1];
            index1++;
        } else {
            merged[index1 + index2] = arr2[index2];
            index2++;
        }
        // recursively merge the rest of the arrays
        return mergeArrays(arr1, arr2, index1, index2, merged);
    }

    private static void copyArray(int[] arr1, int[] arr2, int index1, int index2) {
        // base case: if the index is out of bounds, return
        if (index1 < 0 || index1 >= arr1.length || index2 < 0 || index2 >= arr1.length) {
            return;
        }
        
        // copy the value at the current index
        arr2[index2] = arr1[index1];
        
        // recursively copy the rest of the array
        copyArray(arr1, arr2, index1 + 1, index2 + 1);
    }

    
    //Q5 (0:20 - 0:25)
    public static int [] mapIntoSquared (int [] arr){
        return mapIntoSquaredHelper(arr, new int [arr.length], 0);
    }

    private static int [] mapIntoSquaredHelper (int [] arr, int [] result, int index){
        if (index == arr.length){
            return result;
        }
        result[index] = arr[index] * arr[index];
        return mapIntoSquaredHelper(arr,result,index + 1);
        
    }
    //Q6 (0:25 - 0:32)
    public static String[] filterByLength(String[] arr, int minLen) {
        
        int count = filterByLengthCounter(arr, minLen, 0);
        String[] filteredArray = new String[count];
        filteredArray = filterByLengthHelper(arr, filteredArray, minLen, 0, 0);
        return filteredArray;
    }
    
    private static int filterByLengthCounter(String[] arr, int minLen, int index) {
        if (arr.length == index) {
            return 0;
        }
        int isInLength = (arr[index].length() >= minLen) ? 1 : 0;
        return isInLength + filterByLengthCounter(arr, minLen, index + 1);
    }
    
    private static String[] filterByLengthHelper(String[] arr, String[] filtered, int minLen, int originalArrIndex, int newArrIndex) {
        if (filtered.length == originalArrIndex) {
            return filtered;
        }
        if (arr[originalArrIndex].length() >= minLen){
            filtered[newArrIndex] = arr[originalArrIndex];
            return filterByLengthHelper(arr, filtered, minLen, originalArrIndex + 1, newArrIndex + 1);
        }
        return filterByLengthHelper(arr, filtered, minLen, originalArrIndex + 1, newArrIndex);
    }

    //Q7 (0:32 - 0:40)
    public static boolean isSubArr(int[] arr1, int[] arr2) {
        return isSubArr(arr1, arr2, 0, 0, 0);
    }

    private static boolean isSubArr(int[] smaller, int[] bigger, int index1, int index2, int startPoint) {
        //if -> true case
        if (index1 == smaller.length) {
            return true;
        }
        //if -> false case
        if (startPoint > bigger.length - smaller.length + 1){
            return false;
        }
        if (smaller[index1] == bigger[index2]) {
            return isSubArr(smaller, bigger, index1 + 1, index2 + 1, startPoint);
        }
        return isSubArr(smaller, bigger, 0, startPoint + 1, startPoint + 1);
    }

    // array to store the maximum sum of subarrays ending at each index


}

    