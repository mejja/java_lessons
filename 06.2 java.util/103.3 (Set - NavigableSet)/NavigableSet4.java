import java.util.NavigableSet; // Imports the NavigableSet interface, which offers navigation methods.
import java.util.TreeSet; // Imports the TreeSet class, which stores elements in sorted order.

public class NavigableSet4{ // Declares the main class.
	public static void main(String[] args){ // The entry point of the program.
		
		// Instantiates a NavigableSet of Longs using the TreeSet implementation.
		NavigableSet<Long> navigableSet = new TreeSet<>();

		// Adding Long elements to the set. TreeSet automatically sorts them.
		navigableSet.add(88L); 
		navigableSet.add(11L);
		navigableSet.add(77L);
		navigableSet.add(22L);
		navigableSet.add(99L);

		// The sorted set is internally [11, 22, 77, 88, 99].

		// Prints the NavigableSet in its natural (sorted) order.
		System.out.println("NavigableSet: "+navigableSet); 

		// Uses the first() method to retrieve the lowest element in the set (11L).
		System.out.println("The First Item in List IS: "+navigableSet.first()); 

		// Uses the higher(E e) method to retrieve the least element strictly greater than 11L (22L).
		System.out.println("The Next Item in List IS: "+navigableSet.higher(11L)); 
	}
}