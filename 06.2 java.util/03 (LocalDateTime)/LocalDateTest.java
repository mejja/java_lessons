import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTest {
    public static void main(String[] args) {
   		 LocalDateTime currentDate =LocalDateTime.now();  
         Month currentMonth = currentDate.getMonth(); 

   		 System.out.println("Today's Date is : " + currentDate);
         System.out.println("Current Month is : " + currentMonth);
    }
}
