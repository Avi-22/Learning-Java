import java.util.InputMismatchException;
import java.util.Scanner;
import javax.xml.namespace.QName;

public class test {
  /**
   * @param args
   */
  public static void main(String[] args) {
    
    String invalid = "Your chice is invalid";
    Scanner myObj = new Scanner(System.in);
    String[] word1 = { "I", "You", "We", "They" };
    String[] word2 = { "am", "is", "are" };
    String[] word3 = { "happy", "sad", "tired", "thrilled" };

    int firstGroupChoice, secondGroupChoice, thirdGroupChoice;

    String choice_0_2 = "Enter yoer choice 0-2";
    String choice_0_3 = "Enter yoer choice 0-3";
    String first_group = "The firs group is: I = 0 , You = 1, We = 2, They = 3. ";
    String second_group = "The secound gruop is: am = 0, is = 1, are = 2. ";
    String third_group = "The third group id: happy = 0, sad = 1, tired = 2, thrilled = 3. ";

    System.out.println("Enter Your Name");
    String userName = myObj.nextLine();
    System.out.println("Hello " + userName + " you have a choice to build your on sentence.");
    System.out.println(first_group + choice_0_3);
    firstGroupChoice = check_viablity(3, first_group, choice_0_3, invalid, myObj);

    System.out.println(second_group + choice_0_2);
    secondGroupChoice = check_viablity(2, second_group, choice_0_2, invalid, myObj);

    System.out.println(third_group + choice_0_3);
    thirdGroupChoice = check_viablity(3, third_group, choice_0_3, invalid, myObj);

    String __first_word = word1[firstGroupChoice];
    String __second_word = word2[secondGroupChoice];
    String __third_word = word3[thirdGroupChoice];

    System.out.print(__first_word + " " + __second_word + " " + __third_word);
  }

  public static int check_viablity(int max, String group, String choice, String invalid, Scanner myObj){
    int input;
    try {
      input = myObj.nextInt();
    } catch (Exception e) {
      System.out.println("Error");
    }

    while (input < 0 || input > max) {
      System.out.println(invalid);
      System.out.println(group);
      System.out.println(choice); 
    return input;
  }
  }
}