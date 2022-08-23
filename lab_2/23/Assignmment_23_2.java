public class Assignmment_23_2 {
    public static void main(String[] args) {
        int first_num, second_num;
        boolean are_equal;
        String operatiion = args[1];
        first_num = Integer.parseInt(args[0]);
        second_num = Integer.parseInt(args[2]);

        are_equal = operatiion.equals("+");
        if (are_equal) {
            System.out.println(first_num + second_num);
        }
        are_equal = operatiion.equals("*");
        if (are_equal) {
            System.out.println(first_num * second_num);
        }
        are_equal = operatiion.equals("-");
        if (are_equal) {
            System.out.println(first_num - second_num);
        }
        are_equal = operatiion.equals("/");
        if (are_equal) {
            System.out.println(first_num / second_num);
        }
        are_equal = operatiion.equals("**");
        if (are_equal) {
            System.out.println(first_num / second_num);
        }

    }
}
