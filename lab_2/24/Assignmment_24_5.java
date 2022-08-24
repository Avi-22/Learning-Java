public class Assignmment_24_5 {
    public static void main(String[] args) {
        int max_num, min_num;
        min_num = Integer.parseInt(args[0]);
        max_num = Integer.parseInt(args[1]);
    
        while(min_num< max_num){
            
            if (min_num%3==0){
                System.out.println(min_num);
            }
            min_num++;
        }

    }
    
}
