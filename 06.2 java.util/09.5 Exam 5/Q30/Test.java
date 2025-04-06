import java. time .*;
import java. time. format. DateTimeFormatter;

public class Test {
	public static void main(String[] args) {
		LocalDate valDay = LocalDate.of(2018, 2, 14);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD-MM-uuuu");
		System.out.println(valDay.format(formatter));
	}
}

