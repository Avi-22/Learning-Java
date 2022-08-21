import java.util.Scanner;

public class test_2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int input=331;
        System.out.println("Enter your number");

        
        try {
             input = myObj.nextInt();
        } catch (Exception e) {
            System.out.println("Something went wrong.");      
        }
    
        System.out.println("yaaa "+input);


    }
}
