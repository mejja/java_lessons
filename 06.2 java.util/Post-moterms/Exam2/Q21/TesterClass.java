import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesterClass{
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();

		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");

		Comparator comparator = Collections.reverseOrder();

		Collections.sort(arrayList,comparator);
		System.out.println("ArrayList is :"+ arrayList);
	}
}