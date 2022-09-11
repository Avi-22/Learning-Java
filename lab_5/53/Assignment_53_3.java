public class Assignment_53_3 {
    public static int[] max_to_min(int[] array) {
    int middel;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                if (array[i]< array[j]){
                    middel= array[i];
                    array[i]=array[j];
                    array[j]=middel;
                }
            } 
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 99 };
        int[] max = max_to_min(array);
        for (int i = 0; i < max.length; i++) {
            System.out.print(max[i] + ", ");
        }
    }
}