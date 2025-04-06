import java.time.*;
import java.time.format.*;
import java.util.Locale;

public class Test {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE", Locale.US);
		System.out.println(formatter.format(LocalDateTime.now()));
	}
}