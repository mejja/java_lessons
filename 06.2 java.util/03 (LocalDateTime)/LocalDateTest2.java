import java.time.LocalDateTime;
import java.time.*;

public class LocalDateTest2 {
    public static void main(String[] args) {
   		 LocalDateTime currentDate =LocalDateTime.now();
         int currentYear = currentDate.getYear();
         Month currentMonth = currentDate.getMonth();
         int currentDay= currentDate.getDayOfMonth();
         DayOfWeek dayOfTheWeek = currentDate.getDayOfWeek();


   		 System.out.println("Today's Date is : " + currentDate);
         System.out.println("Year is : " + currentYear);
         System.out.println("Month is : " + currentMonth);
         System.out.println("Day is of the Month : " + currentDay);
         System.out.println("Day is of the week : " + dayOfTheWeek);
    }
}
