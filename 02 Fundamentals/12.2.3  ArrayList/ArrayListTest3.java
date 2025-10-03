import java.util.ArrayList;

public class ArrayListTest3 {
    public static void main(String[] args) {

        // Create an ArrayList to store names
        ArrayList<String> names = new ArrayList<>();

        // Add names to the list
        names.add("Major");
        names.add("Kiema");
        names.add("Mbandi");

        // Display the original list of names
        System.out.println("Original list: " + names);

        // Remove the second element ("Kiema") from the list
        names.remove(1); // Index 1 corresponds to "Kiema"

        // Display the updated list after removal
        System.out.println("Updated list (after removing 'Kiema'): " + names);
    }
}
