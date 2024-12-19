import java.util .*;

public class SortAndSearch2 {
	static final Comparator<Integer> IntegerComparator = new Comparator<Integer>(){
	public int compare (Integer n1, Integer n2) {
		return n2.compareTo(n1);
	}
};
public static void main(String args[]) {
	ArrayList<Integer> list = new ArrayList<>();
	list.add (4);
	list.add (1);
	list.add (3);
	list.add (2);

	Collections.sort(list, null);
	System.out.println(Collections.binarySearch(list, 3));
	Collections.sort(list,IntegerComparator);
	System.out.println(Collections.binarySearch(list, 3));
	}
}