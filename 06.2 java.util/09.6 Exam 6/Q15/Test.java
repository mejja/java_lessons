import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;


public class Test {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.of (2017,10,27,14,22, 54, 0) ;
		DateTimeFormatter formatter =
		DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z"); // L1
		String formattedDateTime = now.format(formatter);
		System.out.println ("Formatted DateTime: " + formattedDateTime);



	}
}
