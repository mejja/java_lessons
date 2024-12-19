public class Question43 {
	public static void main(String[] args) {
		int week = 2;
		String day;
		switch (week) {
			case 1:
				day = "Sunday";
				break;
			case 2:
				day = "Monday";
				if(5%2 == 1 || 6*4 == 24)
					System.out.println("switch");
				else
					System.out.println(week);
			case 3:
				day = "Tuesday";
				break;
			case 4:
				day = "Wednesday";
				break;
			case 5:
				day = "Thursday";
				break;
			case 6:
				day = "Friday";
				break;
			case 7:
				day = "Saturday";
				break;
			default:
				day = "Invalid day";
				break;
			}

			System.out.println(day);
	}

}