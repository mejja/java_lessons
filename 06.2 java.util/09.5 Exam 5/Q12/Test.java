import java. time. LocalDate;
import java.time.Month;
import java. time. Period;

public class Test {
public static void main(String[] args) {
LocalDate startDate = LocalDate.of(2018, Month.MARCH, 1);
LocalDate endDate = LocalDate.of(2018, Month.MARCH, 11);

System.out.println(Period.between(endDate, startDate));



}
}