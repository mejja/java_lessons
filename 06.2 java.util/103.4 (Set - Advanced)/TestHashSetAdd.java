import java.util.HashSet; // Imports the HashSet class from the Java Utilities library.
import java.util.Set; // Optional: Importing Set is often done but not strictly necessary here. 

public class TestHashSetAdd{ // Declares the main class for the program.
	public static void main(String[] args){ // The entry point of the program.
        
		// Instantiates a new HashSet designed to hold Long objects. 
        // Note: The variable name 'stack' is misleading; a HashSet is not a stack (LIFO structure).
		HashSet<Long> stack = new HashSet<>(); 

		stack.add(303L); // Adds the Long value 303 to the set.
		stack.add(101L); // Adds the Long value 101 to the set.
		stack.add(202L); // Adds the Long value 202 to the set.

		// Prints the contents of the HashSet.
		System.out.println("The HashSet Is: "+ stack); 
	}
}