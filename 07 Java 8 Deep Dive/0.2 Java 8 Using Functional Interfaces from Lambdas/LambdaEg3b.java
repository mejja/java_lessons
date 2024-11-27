import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaEg3b {
   public static void main(String[] args) {
       List<String> friends =new ArrayList<>(Arrays.asList("1Brian", "Nate", "Neal", "Raju", "Sara", "Scott"));
         // Convert all names to uppercase
         friends.replaceAll(e -> e.toUpperCase());
         // Remove names that start with a digit
        friends.removeIf(e -> Character.isDigit(e.charAt(0)));
       System.out.println(friends);
   }
}
