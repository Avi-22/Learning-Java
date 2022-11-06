public class TimeFormat {

	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String AM_PM;
		String print_format = "" + minutes;
		if (hours > 12) {
			hours -= 12;
			AM_PM = "PM";
		} else if (hours == 12) {
			AM_PM = "PM";
		} else {
			AM_PM = "AM";
		}
		if (minutes < 10) {
			print_format = "0" + minutes;
		}

		System.out.println(hours + ":" + print_format + " " + AM_PM);
	}
}