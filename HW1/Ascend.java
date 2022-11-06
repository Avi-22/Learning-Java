public class Ascend {
	public static void main(String[] args) {
		int range = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * range);
		int b = (int) (Math.random() * range);
		int c = (int) (Math.random() * range);
		int max, min, mid;

		System.out.println(a + " " + b + " " + c);
		min = Math.min(Math.min(a, b), c);
		max = Math.max(Math.max(a, b), c);
		mid = (a+b+c)-max-min;
		System.out.println(min + " " + mid + " " + max);
	}
}
