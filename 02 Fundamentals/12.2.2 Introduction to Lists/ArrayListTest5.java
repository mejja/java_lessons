import java.util.ArrayList;
import java.util.List;

public class ArrayListTest5 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(); 

        // Adding elements to the list
        names.add("Major");
        names.add("Mbandi");
        names.add("Amy");
        names.add("Kiema");
        names.add("Kitonga");

        // Print the list before clearance
        System.out.println("List before clearance: " + names);

        // Get and print the size of the list
        System.out.println("Size of the list: " + names.size());
    }
}
