import java.util.Scanner;

public class test {
  /**
   * @param args
   */

  public static void main(String[] args) {

    Scanner name = new Scanner(System.in);
    Scanner firs = new Scanner(System.in);
    Scanner second = new Scanner(System.in);
    Scanner third = new Scanner(System.in);

    String[] word1 = { "I", "You", "We", "They" };
    String[] word2 = { "am", "is", "are" };
    String[] word3 = { "happy", "sad", "tired", "thrilled" };

    int firstGroupChoice, secondGroupChoice, thirdGroupChoice;

    System.out.println("Enter Your Name");
    String userName = name.nextLine();
    System.out.println("Hello " + userName + "you have a choice to build your on sentence.");
    System.out.println("The firs group is: I = 0 , You = 1, We = 2, They = 3.");
    System.out.println("Enter yoer choice 0-3");
    firstGroupChoice = firs.nextInt();
    if (firstGroupChoice > 3 || firstGroupChoice < 0) {
      System.out.println("Your chice is invalid");
      System.out.println("The firs group is: I = 0 , You = 1, We = 2, They = 3.");
      System.out.println("Enter yoer choice 0-3");
      firstGroupChoice = firs.nextInt();
    }

    System.out.println("The secound gruop is: am = 0, is = 1, are = 2. ");
    System.out.println("Enter your choice 0-2");
    secondGroupChoice = second.nextInt();
    if (secondGroupChoice > 2 || secondGroupChoice < 0) {
      System.out.println("Your choice is invalid");
      System.out.println("The secound gruop is: am = 0, is = 1, are = 2. ");
      System.out.println("Enter your choice 0-2");
      secondGroupChoice = second.nextInt();
    }

    System.out.println("The third group id: happy = 0, sad = 1, tired = 2, thrilled = 3.");
    System.out.println("Enter yoer choice 0-3");
    thirdGroupChoice = third.nextInt();
    if (thirdGroupChoice > 3 || thirdGroupChoice < 0) {
      System.out.println("Your choice is invalid");
      System.out.println("The third group id: happy = 0, sad = 1, tired = 2, thrilled = 3.");
      System.out.println("Enter yoer choice 0-3");
      thirdGroupChoice = third.nextInt();
    }

    String __first_word = word1[firstGroupChoice];
    String __second_word = word2[secondGroupChoice];
    String __third_word = word3[thirdGroupChoice];

    System.out.print(__first_word + " " + __second_word + " " + __third_word);
  }

}
