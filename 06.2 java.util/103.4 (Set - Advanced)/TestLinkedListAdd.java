import java.util.LinkedList; // Imports the LinkedList class from the Java Utilities library.
import java.util.List; // Optional: Importing List is often done, but not strictly necessary here.

public class TestLinkedListAdd{ // Declares the main class for the program.
	public static void main(String[] args){ // The entry point of the program.

		// Instantiates a new LinkedList designed to hold Long objects.
        // A LinkedList maintains the order of elements as they are added (insertion order).
		LinkedList<Long> stack = new LinkedList<>(); 

		stack.add(303L); // Adds the Long value 303 to the end of the list (index 0).
		stack.add(101L); // Adds the Long value 101 to the end of the list (index 1).
		stack.add(202L); // Adds the Long value 202 to the end of the list (index 2).

		// Prints the contents of the LinkedList.
		System.out.println("The LinkedList Is: "+ stack); 
	}
}