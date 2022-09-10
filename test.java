public class test {
  public static void main(String[] args) {
    int cu = 0;
    int num = 20;
    boolean prime = true;
    for (int i = 2; i < num; i++) {
      for (int j = 2; j <= i / 2; j++) {
        if (i % j == 0) {
          prime = false;
          break;
        }
        if (prime == true) {
          cu++;
          System.out.println(i);
        }
      }
      prime = true;
    }
    System.out.println(cu);
  }
}