public class TimeCalc {

	public static void main(String[] args) {
		if (input_checkbox(args[0], args[1])) {
			System.out.println(time_calc(args[0], args[1]));
		} else {
			System.out.println("Invalid input");
		}
	}

	public static String time_calc(String hh_mm, String min) {
		int hours = Integer.parseInt("" + hh_mm.charAt(0) + hh_mm.charAt(1));
		int minutes = Integer.parseInt("" + hh_mm.charAt(3) + hh_mm.charAt(4));
		int all_in_minutes = Integer.parseInt(min);
		all_in_minutes = (hours * 60) + minutes + all_in_minutes;
		all_in_minutes = ((all_in_minutes < 0) ? all_in_minutes + 1440 : all_in_minutes);
		hours = (all_in_minutes / 60) % 24;
		minutes = all_in_minutes % 60;

		return time_format(hours, minutes);
	}

	public static String time_format(int hours, int minutes) {
		String am_pm;
		if (hours > 12) {
			hours -= 12;
			am_pm = "PM";
		} else if (hours == 12) {
			am_pm = "PM";
		} else {
			am_pm = "AM";
		}
		String minutes_with_0 = ((minutes < 10) ? "0" + minutes : "" + minutes);
		return hours + ":" + minutes_with_0 + " " + am_pm;
	}

	public static boolean input_checkbox(String hh_mm, String input) {
		return check_horus_and_min(hh_mm) && check_minutes(input);
	}

	public static boolean check_horus_and_min(String hh_mm) {
		boolean checkr = true;
		if (hh_mm.length() == 5) {
			Boolean colon = hh_mm.charAt(2) == ':';
			boolean hh = check_if_num(hh_mm.charAt(0)) && check_if_num(hh_mm.charAt(1));
			boolean mm = check_if_num(hh_mm.charAt(3)) && check_if_num(hh_mm.charAt(4));
			if (hh && mm && colon) {
				int minutes = Integer.parseInt("" + hh_mm.charAt(3) + hh_mm.charAt(4));
				int hours = Integer.parseInt("" + hh_mm.charAt(0) + hh_mm.charAt(1));
				if (minutes >= 60 || hours >= 24) {
					checkr = false;
				}
			} else {
				checkr = false;
			}

		} else {
			checkr = false;
		}
		return checkr;
	}

	public static boolean check_minutes(String input) {
		boolean check = true;
		if (input.charAt(0) == '-') {
			for (int i = 1; i < input.length(); i++) {
				if (check_if_num(input.charAt(i)) == false)
					check = false;
			}
		} else {
			for (int i = 0; i < input.length(); i++) {
				if (check_if_num(input.charAt(i)) == false)
					check = false;
			}
		}
		if (check) {
			int tep_input = Integer.parseInt(input);
			check = (tep_input >= -1440);
		}
		return check;
	}

	public static boolean check_if_num(char index) {
		String zero_to_nine = "0123456789";
		if (zero_to_nine.indexOf(index) != -1) {
			return true;
		}
		return false;
	}
}
