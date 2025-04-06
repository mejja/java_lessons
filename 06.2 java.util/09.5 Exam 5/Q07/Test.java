import java. time. LocalTime;

public class Test {
	public static void main(String [] args) {
		LocalTime time = LocalTime.parse("14:14:59.1111");
		System.out.println(time);
	}
}