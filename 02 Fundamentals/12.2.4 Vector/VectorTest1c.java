import java.util.Vector;

public class VectorTest1c {
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

        // Clear all elements from the vector
        fruits.clear();

        // Display the vector after clearing its contents
        System.out.println("Fruit list after clearing: " + fruits);
    }
}

