import java.time.LocalDate;
import java.time.Period;

public class LocalDateTest2 {
    public static void main(String[] args) { 
        LocalDate currentDate = LocalDate.now();
        LocalDate birthday = LocalDate.of(1960, 1, 1);
        Period p = Period.between(birthday, currentDate);
        Period m = p.minusYears(5);
        System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
        " months, and " + p.getDays() + " days old."); 
        System.out.println("Age minus 5 is: "+ m.getYears() +" Years old");
    }
}
