import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TestClass {
	public static void main(String[] args) {
		System.out.println(LocalDate.of(2015, Month. JANUARY, 01).format (DateTimeFormatter.ISO_DATE_TIME) );
	}
}

//What will the following line of code print?