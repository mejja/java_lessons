import java.time.*;
import java.time.ZoneId;
import java.util.Date;

public class Test2 {
	public static void main(String[] args) {
		Date date = new Date();
		LocalDate localDate = Instant.ofEpochMilli(date.getTime())
									 .atZone(ZoneId.systemDefault())
									 .toLocalDate();
		System.out.println("Date is:" + date);
		System.out.println("LocalDate is:" + localDate);
	}
}