public class Cheers {
    public static void main(String[] args) {
      int num = Integer.parseInt(args[1]);
      for (int i = 0; i < args[0].length() ; i++){
        String vowel = "aeiouAEIOU";
        String n = "";
        if ( vowel.indexOf(args[0].charAt(i))  != -1){
            n = "n";
        }
        System.out.println("Give me a" + n +" " + args[0].charAt(i)+ ": " + args[0].charAt(i) + "!");
      }
      System.out.println("What does that spell?");
      for (int i =0 ; i < num; i++){
        System.out.println(args[0]+"!!!");
      }
    }
}    