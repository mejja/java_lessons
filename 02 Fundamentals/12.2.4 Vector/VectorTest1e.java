import java.util.Vector;

public class VectorTest1e {
    public static void main(String[] args) {

        // Create a Vector to store fruit names
        Vector<String> fruits = new Vector<>();

        // Add fruits to the vector
        fruits.add("banana");
        fruits.add("apples");
        fruits.add("Pineapples");
        fruits.add("mangoes");
        fruits.add("oranges");
        fruits.add("watermelon");
        fruits.add("grapes");

        // Display the contents of the vector
        System.out.println("Fruit list: " + fruits);

        // Check if the vector contains the string "grapes"
        System.out.println("Does the list contain 'grapes'? " + fruits.contains("grapes")); // Expected: true
    }
}