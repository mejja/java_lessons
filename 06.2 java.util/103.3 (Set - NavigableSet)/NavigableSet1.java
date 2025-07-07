import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSet1{
	public static void main(String[] args){
		NavigableSet<Long> navigableSet = new TreeSet<>();//instance

		navigableSet.add(88L);
		navigableSet.add(11L);
		navigableSet.add(77L);
		navigableSet.add(22L);
		navigableSet.add(99L);

		//Getting the last element in the list
		System.out.println("NavigableSet: "+navigableSet);
		System.out.println("The Last Item in List IS: "+navigableSet.last());
	}
}