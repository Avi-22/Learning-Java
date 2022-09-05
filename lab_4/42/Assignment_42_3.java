public class Assignment_42_3 {
    public static double calculate_distance(int x1, int y1, int x2, int y2) {
        double distance = 0;
        distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return distance;
    }

    public static void user_output(String[] array) {
        int x1 = Integer.parseInt(array[0]);
        int y1 = Integer.parseInt(array[1]);
        int x2 = Integer.parseInt(array[2]);
        int y2 = Integer.parseInt(array[3]);
        double distance = calculate_distance(x1, y1, x2, y2);
        System.out.println("The distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + distance);
    }

    public static void main(String[] args) {
        user_output(args);
    }
}
