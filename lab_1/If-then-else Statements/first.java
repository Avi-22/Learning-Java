public class first {
    public static void main(String[] args) {
        byte number = 19;

        boolean three_digits = (number%100==0) && (number != 0);
        boolean two_digits = (number>= 10) && (number != 100);



        if (three_digits){
            System.out.println("3");
        }

        else if(two_digits){
            System.out.println("2");
        }

        else {
            System.out.println("1");
        }
     
    }
}
