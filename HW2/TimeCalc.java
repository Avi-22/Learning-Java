public class TimeCalc {

	public static void main(String[] args) {
		if (input_checkbox(args[0], args[1])) {
			int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
			int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
			int num = Integer.parseInt(args[1]);
			int all_in_minutes = (hours * 60) + minutes + num;
			all_in_minutes = ((all_in_minutes < 0) ? all_in_minutes + 1440 : all_in_minutes);
			hours = (all_in_minutes / 60) % 24;
			minutes = all_in_minutes % 60;

			System.out.println(time_format(hours, minutes));
		} else {
			System.out.println("Invalid input");
		}
	}

	public static boolean input_checkbox(String hh_mm, String input) {
		boolean check = true;
		if (hh_mm.length() == 5) {
			char colon = hh_mm.charAt(2);
			boolean hh = check_num(hh_mm.charAt(0)) && check_num(hh_mm.charAt(1));
			boolean mm = check_num(hh_mm.charAt(3)) && check_num(hh_mm.charAt(4));
			if ((colon != ':')) {
				check = false;
			}
			if (hh) {
				int minutes = Integer.parseInt("" + hh_mm.charAt(3) + hh_mm.charAt(4));
				check = (minutes < 60);
			}
			if (mm) {
				int hours = Integer.parseInt("" + hh_mm.charAt(0) + hh_mm.charAt(1));
				check = (hours < 24);
			}
		}
		if (input.charAt(0) == '-') {
			for (int i = 1; i < input.length(); i++) {
				if (check_num(input.charAt(i)) == false)
					check = false;
			}
		} else {
			for (int i = 0; i < input.length(); i++) {
				if (check_num(input.charAt(i)) == false)
					check = false;
			}
		}
		if (check) {
			int tep_input = Integer.parseInt(input);
			check = (tep_input >= -1440);
		}

		return check;
	}

	public static boolean check_num(char num) {
		switch (num) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				break;
			default:
				return false;
		}
		return true;
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
}
