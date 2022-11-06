public class FVCalc {
	public static void main(String[] args) {
		int current_val = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int yesrs = Integer.parseInt(args[2]);
		double precentage = (rate / 100) + 1;
		int futuer_val = (int) (current_val * (Math.pow(precentage, yesrs)));

		System.out.println(
				"After " + yesrs + " years, a $" + current_val + " saved at " + rate + "% will yield $" + futuer_val);
	}
}