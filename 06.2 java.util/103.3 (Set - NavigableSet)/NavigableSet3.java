import java.util.NavigableSet; // Imports the NavigableSet interface from the Java Utilities library.
import java.util.TreeSet; // Imports the TreeSet class, which implements NavigableSet.

public class NavigableSet3{ // Declares the class containing the main method.
	public static void main(String[] args){ // The main method where program execution begins.

		// Instantiates a NavigableSet of Longs using the TreeSet implementation.
		NavigableSet<Long> navigableSet = new TreeSet<>();

		navigableSet.add(88L); // Adds the Long value 88 to the set.
		navigableSet.add(11L); // Adds the Long value 11 to the set.
		navigableSet.add(77L); // Adds the Long value 77 to the set.
		navigableSet.add(22L); // Adds the Long value 22 to the set.
		navigableSet.add(99L); // Adds the Long value 99 to the set.

		// Prints the NavigableSet (which is automatically sorted by TreeSet: [11, 22, 77, 88, 99]).
		System.out.println("NavigableSet: "+navigableSet);

		// Prints the last (highest) element in the set, which is 99L.
		System.out.println("The Last Item in List IS: "+navigableSet.last());

		// Prints the greatest element strictly less than 99L, which is 88L.
		System.out.println("The Previous Item in List IS: "+navigableSet.lower(99L)); 
	}
}