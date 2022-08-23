public class Assignment_22_1 {
    public static void main(String[] args) {
        int year = 2022;
        int age = 17;

        boolean election_year = year % 4 == 0;
        boolean allowed_to_vote = age >= 18;
        if (election_year && allowed_to_vote) {
            System.out.println("Allowed");
        }
        else{
            System.out.println("Not allodwed");
        }
    }
}
