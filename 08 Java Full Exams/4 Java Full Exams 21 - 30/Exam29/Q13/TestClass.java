import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.*;
public class TestClass{
	public static void main (String[] args) {
		LocalDate date1 = LocalDate.of (2016, Month. JANUARY, 1);
		LocalDateTime date2 = LocalDateTime.of (2017, Month. JUNE, 1, 1, 1);
		Period p = Period.between (date1, date2);
		System.out.print (p.getYears () + ":" + p.getMonths () + ":" + p.getDays () );
	}
}