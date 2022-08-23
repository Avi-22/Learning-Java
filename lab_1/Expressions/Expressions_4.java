package lab_1.Expressions;
public class Expressions_4 {
    public static void main(String[] args) throws Exception {
        int num =2468;
        int sum =(num-num%10)/1000 + (num%1000)/100 + (num%100)/10 + num%10;

        System.out.println("The sum of the numbers "+num+ " is "+sum);
        
        

    
    }

}
