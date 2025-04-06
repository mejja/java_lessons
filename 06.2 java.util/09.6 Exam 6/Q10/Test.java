import java.time.*;
import java.time.format.*;
import java.util.Locale;

public class Test {
	public static void main(String[] args) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ISO_DATE; // DEF
		LocalDate dateOfBirth = LocalDate.of(2015, Month.FEBRUARY,31);
		System.out.println(dateFormat.format(dateOfBirth)); // USE
	}
}