public class Test2 {
public static void main(String[] args) {
double day = 5.0;
String dayString;

	switch (day) {
	case 2.0:
		dayString = "Monday";
		// break;
	case 3.0:
		dayString = "Tuesday";
		// continue;
	case 4.0:
		dayString = "Wednesday";
		// break;
	case 5.0:
		dayString = "Thursday";
		// break;
	default:
		dayString = "Invalid day";
		// break;
	}
	System.out.println(dayString);

}}