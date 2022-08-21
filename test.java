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

    String invalid = "Your chice is invalid";
    String choice_0_2 = "Enter yoer choice 0-2";
    String choice_0_3 = "Enter yoer choice 0-3";
    String first_group = "The firs group is: I = 0 , You = 1, We = 2, They = 3.";
    String second_group = "The secound gruop is: am = 0, is = 1, are = 2. ";
    String third_group = "The third group id: happy = 0, sad = 1, tired = 2, thrilled = 3.";

    System.out.println("Enter Your Name");
    String userName = name.nextLine();
    System.out.println("Hello " + userName + " you have a choice to build your on sentence.");
    System.out.println(first_group);
    System.out.println(choice_0_3);
    firstGroupChoice = firs.nextInt();
    if (firstGroupChoice > 3 || firstGroupChoice < 0) {
      System.out.println(invalid);
      System.out.println(first_group);
      System.out.println(choice_0_3);
      firstGroupChoice = firs.nextInt();
    }

    System.out.println(second_group);
    System.out.println(choice_0_2);
    secondGroupChoice = second.nextInt();
    if (secondGroupChoice > 2 || secondGroupChoice < 0) {
      System.out.println(invalid);
      System.out.println(second_group);
      System.out.println(choice_0_2);
      secondGroupChoice = second.nextInt();
    }

    System.out.println(third_group);
    System.out.println(choice_0_3);
    thirdGroupChoice = third.nextInt();
    if (thirdGroupChoice > 3 || thirdGroupChoice < 0) {
      System.out.println(invalid);
      System.out.println(third_group);
      System.out.println(choice_0_3);
      thirdGroupChoice = third.nextInt();
    }

    String __first_word = word1[firstGroupChoice];
    String __second_word = word2[secondGroupChoice];
    String __third_word = word3[thirdGroupChoice];

    System.out.print(__first_word + " " + __second_word + " " + __third_word);
  }

}
