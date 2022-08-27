public class Assignmment_24_4 {
  public static void main(String[] args) {
    int max_num, min_num, sum = 0;

    min_num = Integer.parseInt(args[0]);
    max_num = Integer.parseInt(args[1]);

    while (min_num <= max_num) {
      sum = sum + min_num;
      min_num++;
    }
    System.out.println(sum);

  }
}
