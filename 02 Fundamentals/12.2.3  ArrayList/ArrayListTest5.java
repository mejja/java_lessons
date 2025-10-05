import java.util.ArrayList;

public class ArrayListTest5 {
    public static void main(String[] args) {

        // Create an ArrayList to store names
        ArrayList<String> names = new ArrayList<>();

        // Add names to the list
        names.add("Major");
        names.add("Kiema");
        names.add("Mbandi");

        // Display the list of names
        System.out.println("Names in the list: " + names);

        // Display the number of elements in the list
        System.out.println("Total number of names: " + names.size());
    }
}
