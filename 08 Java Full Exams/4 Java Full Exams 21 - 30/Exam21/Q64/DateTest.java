import java.time.*;
import java.time.format.*;
public class DateTest{
	public static void main(String[] args) { //1
		LocalDateTime greatDay = LocalDateTime.parse("2015-01-01");//2
		String greatDayStr = greatDay. format (DateTimeFormatter. ISO_DATE_TIME); //3
		System. out.println(greatDayStr) ;//4
	}
}