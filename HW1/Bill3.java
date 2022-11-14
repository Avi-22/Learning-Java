public class Bill3 {
	public static void main(String[] args) {
		String name1 = args[2], name2 = args[1], name3 = args[0];
		double amount_of_biil = Integer.parseInt(args[3]);
		double divides_by_3 = Math.ceil(amount_of_biil / 3.0);
		String pay = "pay " + divides_by_3 + " Shekels each.";
		String names = "Dear " + name1 + ", " + name2 + ", and " + name3 + ": ";
		System.out.println(names + pay);
	}
}
