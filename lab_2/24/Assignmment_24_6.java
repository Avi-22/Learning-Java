public class Assignmment_24_6 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int i = 1;
        int sum = 0;

        do {
            if (i % 2 != 0) {
                System.out.println(i);
                sum = sum + i;
            }

            i++;
        } while (i <= num);
        System.out.println("The sum of all odd numbers: " + sum);
    }
}
