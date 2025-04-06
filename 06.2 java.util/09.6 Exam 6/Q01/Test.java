import java. time .*;
import java. time. format. DateTimeFormatter;

public class Test {
	public static void main(String [] args) {
		LocalDate date = LocalDate.of(2018, 2, 1);
		DateTimeFormatter formatter = DateTimeFormatter
		.ofPattern("DD'nd day of' uuuu");
		System.out.println(formatter.format(date));
	}
}