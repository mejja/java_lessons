import java.util.ArrayList;

public class ArrayListTest6 {
    public static void main(String[] args) {

        // Create an ArrayList to store names
        ArrayList<String> names = new ArrayList<>();

        // Add names to the list
        names.add("Major");
        names.add("Kiema");
        names.add("Mbandi");
        names.add("Amy"); // Corrected syntax

        // Display the list of names
        System.out.println("Names in the list: " + names);

        // Check if the list contains the name "Major"
        System.out.println("Contains 'Major'? " + names.contains("Major")); // Expected: true

        // Check if the list contains a non-existent name "Majork"
        System.out.println("Contains 'Majork'? " + names.contains("Majork")); // Expected: false
    }
}