public class TestRandom {
	static int a = 0;

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int less_05 = 0;
		double ratio;

		for (int i = 0; i < num; i++) {
			double temp = Math.random();
			if (temp <= 0.5) {
				less_05++;
			}
		}
		ratio = (double) (num - less_05) / less_05;
		System.out.println("> 0.5: " + (num - less_05) + " times.");
		System.out.println("<= 0.5: " + less_05 + " times.");
		System.out.println("Ratio: " + ratio);
	}
}