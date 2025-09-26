import java.util.ArrayList;
import java.util.List;

public class VectorTest1 {
    public static void main(String[] args) {

        // Create a list to store integer values using ArrayList implementation
        List<Integer> numbers = new ArrayList<>();

        // Add integers to the list at specific indices
        numbers.add(0, 1); // Index 0: value 1
        numbers.add(1, 2); // Index 1: value 2

        // Print the list contents
        System.out.println("List of numbers: " + numbers);
    }
}
