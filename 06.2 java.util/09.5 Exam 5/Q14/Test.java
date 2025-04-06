import java. time .*;

public class Test {
public static void main(String [] args) {
System.out.println(LocalDate.of(2018, 6, 6)
.plus(Period.parse("P9M")));
}
}
