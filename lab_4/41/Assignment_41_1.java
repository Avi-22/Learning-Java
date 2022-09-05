public class Assignment_41_1 {
    public static void cow() {
        System.out.println("The cow goes moo");
    }

    public static void dog() {
        System.out.println("The dog goes woof");
    }

    public static void sheep() {
        System.out.println("The sheep goes mah");
    }

    public static void crocodile() {
        System.out.println("The corcdile is silent");
    }

    public static void user_input(String choice) {
        if (choice.equals("cow")) {
            cow();
        } else if (choice.equals("dog")) {
            dog();
        } else if (choice.equals("sheep")) {
            sheep();
        } else if (choice.equals("crocodile")) {
            crocodile();
        } else {
            System.out.println("Sorry, we don't have that animal in stock");
        }
    }

    public static void main(String[] args) {
        user_input(args[0]);
    }
}