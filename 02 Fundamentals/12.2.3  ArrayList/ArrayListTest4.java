import java.util.ArrayList;

public class ArrayListTest4 {
    public static void main(String[] args) {

        // Create an ArrayList to store names
        ArrayList<String> names = new ArrayList<>();

        // Add names to the list
        names.add("Major");
        names.add("Kiema");
        names.add("Mbandi");

        // Display the original list of names
        System.out.println("Original list: " + names);

        // Clear all elements from the list
        names.clear();

        // Display the list after clearing its contents
        System.out.println("List after clearing: " + names);
    }
}