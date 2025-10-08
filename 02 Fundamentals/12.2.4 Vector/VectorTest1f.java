import java.util.Vector;

public class VectorTest1f {
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

        // Display the full list of fruits
        System.out.println("Fruit list: " + fruits);

        // Retrieve and display the fruit at index 1
        System.out.println("Fruit at index 1: " + fruits.get(1)); // Expected: "apples"
    }
}
