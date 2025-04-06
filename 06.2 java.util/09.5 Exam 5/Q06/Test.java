import java. time. LocalDate;

public class Test {
	public static void main(String [] args) {
		LocalDate date = LocalDate.ofEpochDay(-1);
		System.out.println(date);
	}
}