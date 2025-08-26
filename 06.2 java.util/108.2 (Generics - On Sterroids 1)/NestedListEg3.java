import java.util.ArrayList;
import java.util.List;

public class NestedListEg3 {
	public static void main(String[] args) {
		
		List<List<Money>> outerList = new ArrayList<List<Money>>();
		
		List<Money> innerList = new ArrayList<Money>();
		List<Money> innerList2 = new ArrayList<Money>();
		List<Money> innerList3 = new ArrayList<Money>();
		
		innerList.add(new Money(Currency.USD, 100));
		outerList.add(innerList);
		innerList2.add(new Money(Currency.GBP, 50));
		innerList2.add(new Money(Currency.GBP, 60));
		outerList.add(innerList2);
		innerList3.add(new Money(Currency.EUR, 200));
		innerList3.add(new Money(Currency.EUR, 150));
		innerList3.add(new Money(Currency.EUR, 250));
		outerList.add(innerList3);
		
		System.out.println("outerList = "+outerList);
	}
}
