import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSet2{
	public static void main(String[] args){
		NavigableSet<Long> navigableSet = new TreeSet<>();//instance

		navigableSet.add(88L);
		navigableSet.add(11L);
		navigableSet.add(77L);
		navigableSet.add(22L);
		navigableSet.add(99L);

		//Getting the 1st element in the list
		System.out.println("NavigableSet: "+navigableSet);
		System.out.println("The First Item in List IS: "+navigableSet.first());
		
	}
}