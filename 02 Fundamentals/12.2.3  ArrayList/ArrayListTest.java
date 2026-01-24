import java.util.ArrayList; // Import ArrayList class from java.util package

public class ArrayListTest {

    public static void main(String[] args) {

        // Create an ArrayList to store fruit names
        // ArrayList is a resizable array that maintains insertion order
        ArrayList<String> fruits = new ArrayList<>();

        // Add fruit names to the ArrayList
        // add() appends elements to the end of the list
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("mellon");

        // Print the contents of the ArrayList
        // The list is printed in the order elements were added
        System.out.println("Available fruits: " + fruits);
    }
}