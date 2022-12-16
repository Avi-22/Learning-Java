public class CalcPi {

	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		double sum = 0, denom = 1;
		for (int i = 0; i < num; i++) {
			if (i % 2 == 0)
				sum = sum + (1 / denom);
			else
				sum = sum - (1 / denom);
			denom += 2;
		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + 4.0 * sum);
	}
}