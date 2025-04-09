import java.time.LocalTime;

public class LocalDateTest2 {
    public static void main(String[] args) {
   		 LocalTime currentTime =LocalTime.now();
         int currentHour = currentTime.getHour();
         int currentMinutes = currentTime.getMinute();  		 
   		 System.out.println("Today’s Date is : "+ currentTime);
         System.out.println("Current Hour is : "+ currentHour);
         System.out.println("Current Minutes is : "+ currentMinutes); 
    }
}
