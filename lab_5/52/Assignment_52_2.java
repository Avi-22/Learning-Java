public class Assignment_52_2 {
    public static String random_card() {
        String random_card;
        int random_grop = (int) (Math.random() * 4 + 1);
        int random_num = (int) (Math.random() * 13 + 1);
        String[] grop = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] num = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
        random_card = num[random_num - 1] + " of " + grop[random_grop - 1];
        return random_card;
    }

    public static void main(String[] args) {
        System.out.println(random_card());
        System.out.println(random_card());
    }
}