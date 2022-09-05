public class Assignment_42_2 {
    public static int rolling_the_dice() {
        int random = (int) (Math.random() * 6 + 1);
        return random;
    }

    public static void random_dice_rolls() {
        int first_dice = rolling_the_dice();
        int second_dice = rolling_the_dice();
        if (first_dice == second_dice) {
            System.out.println("Double Up!: " + first_dice);
        } else {
            int x = Math.max(first_dice, second_dice);
            int y = Math.min(first_dice, second_dice);
            System.out.println("First roll scored: " + x + "!");
            System.out.println("Second roll scored: " + y + "!");
        }

    }
    public static void main(String[] args) {
        random_dice_rolls();
    }
}
