import java.util.Vector; // Imports the Vector class, a legacy synchronized list implementation.
import java.util.List; // Optional: Importing List is often done, but not strictly necessary here.

public class TestVectorAdd{ // Declares the main class for the program.
	public static void main(String[] args){ // The entry point of the program.

		// Instantiates a new Vector designed to hold Long objects.
        // Vector is synchronized, meaning it is thread-safe, but usually slower than ArrayList.
		Vector <Long> stack = new Vector<>(); 

		stack.add(303L); // Adds the Long value 303 to the end of the Vector (index 0).
		stack.add(101L); // Adds the Long value 101 to the end of the Vector (index 1).
		stack.add(202L); // Adds the Long value 202 to the end of the Vector (index 2).

		// Prints the contents of the Vector.
		System.out.println("The Vector Is: "+ stack); 
	}
}