import java.util.Vector;

public class VectorTest1g {
    public static void main(String[] args) {

        // Create a Vector to store fruits
        Vector<String> fruits = new Vector<>();
        fruits.add("banana");
        fruits.add("apples");
        fruits.add("mangoes");
        fruits.add("oranges");

        System.out.println("Fruits before merging:");
        System.out.println(fruits);

        // Create a Vector to store vegetables
        Vector<String> vegetables = new Vector<>();
        vegetables.add("sukumawiki");
        vegetables.add("cabbage");
        vegetables.add("spinach");

        // Merge vegetables into fruits vector
        fruits.addAll(vegetables);

        System.out.println("Fruits vector after merging with vegetables:");
        System.out.println(fruits);
    }
}
