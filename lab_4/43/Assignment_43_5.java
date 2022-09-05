import java.util.Arrays;
public class Assignment_43_5 {
    public static int [][]  multiplication_table(int[] input) {
        int length = input.length;
        int [][] array = new int [length][length];
        for (int i=0; i<length; i++) {
            for (int j=0; j<length; j++) {
                array[i][j] = input[i] * input[j];    
            } 
        }
        return array;
    }
    public static void print_multiplication_table(int[] arr){
       int multiplication_table[][]= multiplication_table(arr);
       System.out.print(" |\t");
       for (int x =0 ; x< arr.length;x++){
        System.out.print(arr[x]+"\t");
    }
    System.out.println();
    for (int i=0; i<arr.length; i++) {
        System.out.print(arr[i]+"|\t");
        for (int j=0; j<arr.length; j++) {
            System.out.print( multiplication_table[i][j]+"\t");
        }
        System.out.println();
    }
    }
public static void main(String[] args) {
    int[] num = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
    print_multiplication_table(num);
}    
}