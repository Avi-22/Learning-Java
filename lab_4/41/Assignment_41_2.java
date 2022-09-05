public class Assignment_41_2 {
    public static boolean user_input(String[] user_input){
        int lengeth = user_input.length;
        if (lengeth !=2){
        System.out.println("Please enter your name and the current hour");
        return false;
        }
        return true;
    }

    public static void greet (String name,String time) {
      int hour = Integer.parseInt(time);
      String greet;
        if (hour >= 6 && hour <= 11){
           greet ="Good morning, ";
        }
        else if (hour >= 12 && hour <= 16){
            greet = "Good afternoon, ";
        }
        else if (hour >= 17 && hour <= 20){
            greet = "Good evening, ";
        }
        else if (hour >= 21 && hour <= 24 || hour >= 0 && hour <= 5){
            greet = "Good night, ";
        }
        else {
            greet = "There is no such time, ";
        }
      System.out.println(greet+name);
    } 
    public static void main(String[] args) {
       if (user_input(args)){
            greet(args[0], args[1]);
       }       
    }
}