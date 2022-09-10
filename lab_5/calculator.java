public class calculator {

   public static double add(double num1, double num2) {
      return num1 + num2;
   }

   public static double subtract(double num1, double num2) {
      return num1 - num2;
   }

   public static double multiple(double num1, double num2) {
      return num1 * num2;
   }

   public static double divide(double num1, double num2) {
      return num1 / num2;
   }

   public static double doOperation(double num1, String op, double num2) {
      double result = -1;
      if (op.equals("+")) {
         result = add(num1, num2);
      } else if (op.equals("-")) {
         result = subtract(num1, num2);
      } else if (op.equals("*")) {
         result = multiple(num1, num2);
      } else if (op.equals("/")) {
         result = divide(num1, num2);
      } else {
         System.out.println("The operation is invalid");
      }
      return result;
   }
   public static void main(String[] args) {

      double num2;
      double result = Double.parseDouble(args[0]);
      for (int i = 1; i < args.length; i += 2) {
         num2 = Double.parseDouble(args[i +1]);
         result = doOperation(result, args[i], num2);
      }
      if (result % 1 == 0) {
         System.out.println((int) result);
      } else {
         System.out.println(result);
      }
   }
}