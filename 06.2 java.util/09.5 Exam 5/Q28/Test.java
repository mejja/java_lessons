import java. time .*;
import java. time. format. DateTimeFormatter;

public class Test {
	public static void main(String [] args) {
		LocalDate date = LocalDate.of(2018, 11, 4);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-uuuu");
		System.out.println(formatter.format(date).equals(date.format(formatter)));
	}
}