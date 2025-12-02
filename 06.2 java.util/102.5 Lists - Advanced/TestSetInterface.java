/**
 * Demonstrates the usage of the custom Set implementation: MyCustomSet.
 */
public class TestSetInterface {

    public static void main(String[] args) {
        // Create a new instance of MyCustomSet
        MyCustomSet<String> mySet = new MyCustomSet<>();

        // Add elements to the set
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Cherry");

        // Print the elements in the set
        System.out.println("MyCustomSet contains: " + mySet);

        // Print the size of the set
        System.out.println("Size: " + mySet.size());

        // Remove an element from the set
        mySet.remove("Banana");
        System.out.println("After removing Banana: " + mySet);

        // Check if specific elements exist in the se
