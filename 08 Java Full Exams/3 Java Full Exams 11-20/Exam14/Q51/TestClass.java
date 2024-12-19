import java.util.*;
public class TestClass{
    public static void main (String args [ ] ) {
        List<Integer> ages = new ArrayList<>();
        
        // Adds the result of Integer.parseInt("5") to the list, which returns 5 (an int)
        ages.add(Integer.parseInt("5")); 

        // Adds the result of Integer.valueOf("6") to the list, which returns an Integer object
        ages.add(Integer.valueOf("6")); 

        // Adds the integer 7 using autoboxing (converts the int to an Integer object)
        ages.add(7); 

        // Adds null to the list
        ages.add(null);

        // Iterates over the list using enhanced for-loop, attempting to unbox the Integer values
        for (int age : ages) System.out.print(age);
    }
}
