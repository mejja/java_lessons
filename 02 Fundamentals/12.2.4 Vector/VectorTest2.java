import java.util.ArrayList;
import java.util.List;

public class VectorTest2 {
    public static void main(String[] args) {

        // Create a List to store names using ArrayList implementation
        List<String> names = new ArrayList<>();

        // Add names to the list at specific indices
        names.add(0, "Major");
        names.add(1, "Mbandi");
        names.add(2, "Amy");
        names.add(3, "Kiema");

        // Display the list of names
        System.out.println("Names list: " + names);
    }
}

