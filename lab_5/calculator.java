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
      if (op.equals("+")) {
         return add(num1, num2);
      } else if (op.equals("-")) {
         return subtract(num1, num2);
      } else if (op.equals('*')) {
         return multiple(num1, num2);
      } else if (op.equals("/")) {
         return divide(num1, num2);
      } else {
         System.out.println("The operation is invalid");
      }
      return -1;
   }

   public static void main(String[] args) {

      double num2;
      double num1 = Integer.parseInt(args[0]);
      for (int i = 1; i < args.length; i += 2) {
         num2 = Integer.parseInt(args[i + 1]);
         String op = args[i];
         num1 = doOperation(num1, op, num2);
      }
      if (num1 % 1 == 0) {
         System.out.println((int) num1);
      } else {
         System.out.println(num1);
      }
   }
}

// int length = args.length / 2 + 1;
// double[] num = new double[length];
// double result;
// String[] op = new String[length - 1];

// for (int i = 0, x = 0; i < length; i++, x += 2) {
// num[i] = Double.parseDouble(args[x]);
// }
// for (int i = 0, x = 1; i < length - 1; i++, x += 2) {
// op[i] = args[x];
// }
