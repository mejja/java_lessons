import java.util.Vector;

public class VectorTest1j {
    public static void main(String[] args) {

        // Create a Vector to store words forming a phrase
        Vector<String> phrase = new Vector<>();

        // Add words to the vector
        phrase.add("I");
        phrase.add("am");
        phrase.add("learning");
        phrase.add("Java");
        phrase.add("with");
        phrase.add("OpenLearn");

        // Display the vector contents
        System.out.println("Vector contents: " + phrase);

        // Convert the vector to an array
        Object[] arr = phrase.toArray();

        // Display the array contents
        System.out.println("Array contents:");
        for (int j = 0; j < arr.length; j++) {
            System.out.println("Index " + j + ": " + arr[j]);
        }
    }
}
