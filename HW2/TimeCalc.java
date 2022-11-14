public class TimeCalc {

	public static void main(String[] args) {
		// Concatenates the empty string "" with the left hour-digit, concatenates the
		// resulting string with the right hour-digit, then casts the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		int num = Integer.parseInt(args[1]);

		boolean input_valid = (hours  >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59) && (num >= -1440 && num <= 1440);
		
		if (input_valid){
			int all_in_minutes = (hours*60) + minutes + num;
			String am_pm;
			if (all_in_minutes < 0){
				all_in_minutes += 1440;
			}
			hours = (all_in_minutes/60)% 24;
			minutes = all_in_minutes % 60;

			if (hours > 12){
				hours -= 12;
				am_pm = "PM"; 
			}
			else if (hours == 12){
				am_pm = "PM";
			}
			else {
				am_pm = "AM";
			}
			String minutes_with_0 = ((minutes < 10) ? "0"+ minutes : ""+minutes ); 
			System.out.println(hours + ":" + minutes_with_0 + " " + am_pm);
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
		
