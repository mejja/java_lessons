import java.util.*;

public class ArrayListTest3 {
    public static void main(String[] args) {
        // Initialize and populate the list
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "Major", "Mbandi", "Amy", "Kiema");

        System.out.println("Original list: " + names);

        // Remove element by index
        names.remove(1); // Removes "Mbandi"
        System.out.println("After removing index 1: " + names);

        // Remove element by value
        names.remove("Kiema");
        System.out.println("After removing 'Kiema': " + names);
    }
}