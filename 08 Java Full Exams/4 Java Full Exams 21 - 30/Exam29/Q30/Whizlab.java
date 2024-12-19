import java.time.LocalDate;

public class Whizlab{
	public static void main(String[] args) {
		LocalDate ldo = LocalDate.of(2012, 12, 31);
		LocalDate ld1 = LocalDate.ofYearDay(2012,365);
		System.out.println(ldo.equals(ld1));
	}
}