import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestClass{
	public static void main(String[] args){
		TestClass instance = new TestClass();
		instance.getDateString();
	}
	public String getDateString(LocalDateTime ldt) {
		return DateTimeFormatter. ISO_ZONED_DATE_TIME. format(ldt);
	}
}