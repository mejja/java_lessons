public class Test3 {
public static void main(String[] args) {
boolean val = false;
String greeting;

	switch (val) {
	case true:
		greeting = "Hello";
		// break;
	case false:
		greeting = "Morning";
		// continue;
	case 4.0:
		greeting = "Good night";
		// break;
	case 5.0:
		greeting = "Good day";
		// break;
	default:
		greeting = "Good Evening";
		// break;
	}
	System.out.println(greeting);

}}