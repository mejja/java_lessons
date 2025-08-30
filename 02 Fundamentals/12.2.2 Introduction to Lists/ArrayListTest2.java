import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {
    public static void main(String[] args) {

        // Create a list to store names using the List interface and ArrayList implementation
        List<String> names = new ArrayList<>();

        // Add names to the list at specific indices
        names.add(0, "Major");   // Index 0: First name
        names.add(1, "Mbandi");  // Index 1: Second name
        names.add(2, "Amy");     // Index 2: Third name
        names.add(3, "Kiema");   // Index 3: Fourth name

        // Print the entire list of names to the console
        System.out.println("Names in the list: " + names);
    }
}

