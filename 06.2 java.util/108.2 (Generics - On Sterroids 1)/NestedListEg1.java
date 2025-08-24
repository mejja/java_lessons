import java.util.ArrayList;
import java.util.List;

public class NestedListEg1 {
	public static void main(String[] args) {
		
		List<List<Money>> outerList = new ArrayList<List<Money>>();
		
		List<Money> innerList = new ArrayList<Money>();
		
		innerList.add(new Money(Currency.USD, 100));
		outerList.add(innerList);
		
		System.out.println("outerList = "+outerList);
	}
}
