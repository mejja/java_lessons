import java.util.Vector;

public class VectorTest1h {
    public static void main(String[] args) {

        // Create a Vector f containing a mix of fruits
        Vector<String> fruits = new Vector<>();
        fruits.add("banana");
        fruits.add("apples");
        fruits.add("mangoes");
        fruits.add("oranges");
        fruits.add("grapes");
        fruits.add("tomato");

        // Create a smaller Vector f1 with a subset of fruits
        Vector<String> subsetFruits = new Vector<>();
        subsetFruits.add("banana");
        subsetFruits.add("apples");
        subsetFruits.add("mangoes");

        // Check if subsetFruits is a subset of fruits
        System.out.println("Is subsetFruits a subset of fruits?");
        System.out.println(fruits.containsAll(subsetFruits)); // true

        // Check if fruits is a subset of subsetFruits
        System.out.println("Is fruits a subset of subsetFruits?");
        System.out.println(subsetFruits.containsAll(fruits)); // false
    }
}
