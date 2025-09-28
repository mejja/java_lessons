import java.util.Vector;

public class VectorTest1b {
    public static void main(String[] args) {

        // Create a Vector to store fruit names
        Vector<String> fruits = new Vector<>();

        // Add various fruits to the vector
        fruits.add("banana");
        fruits.add("apples");
        fruits.add("Pineapples");
        fruits.add("mangoes");
        fruits.add("oranges");
        fruits.add("watermelon");
        fruits.add("grapes");

        // Display the original list of fruits
        System.out.println("Original fruit list: " + fruits);

        // Remove the first fruit ("banana") from the vector
        fruits.remove(0);

        // Display the updated list after removal
        System.out.println("Updated fruit list (after removing 'banana'): " + fruits);
    }
}

