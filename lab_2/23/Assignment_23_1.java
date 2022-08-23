public class Assignment_23_1 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        boolean greater_and_divisible = num>100 && num%3==0;
        System.out.println(greater_and_divisible);
        
    }
}
