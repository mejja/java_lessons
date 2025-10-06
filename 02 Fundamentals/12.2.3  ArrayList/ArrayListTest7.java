import java.util.ArrayList;

public class ArrayListTest7 {
    public static void main(String[] args) {

        // Create an ArrayList to store names
        ArrayList<String> names = new ArrayList<>();

        // Add names to the list
        names.add("Major");
        names.add("Kiema");
        names.add("Mbandi");

        // Display the entire list
        System.out.println("Full list of names: " + names);

        // Access and display individual elements by index of the arrayList
        System.out.println("First name: " + names.get(0));  // Major
        System.out.println("Second name: " + names.get(1)); // Kiema
        System.out.println("Third name: " + names.get(2));  // Mbandi
    }
}
