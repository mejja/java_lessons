import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TestClass2 {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2015, Month.JANUARY, 01).format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
}
