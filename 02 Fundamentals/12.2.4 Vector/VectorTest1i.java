import java.util.Iterator;
import java.util.Vector;

public class VectorTest1i {
    public static void main(String[] args) {

        // Create a Vector to store a phrase
        Vector<String> phrase = new Vector<>();

        // Add words to form a sentence
        phrase.add("I");
        phrase.add("am");
        phrase.add("learning");
        phrase.add("Java");
        phrase.add("with");
        phrase.add("OpenLearn");

        // Display the full phrase as a vector
        System.out.println("Vector contents: " + phrase);

        // Use an iterator to traverse the vector
        Iterator<String> iterator = phrase.iterator();

        System.out.println("Iterating through the vector:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

