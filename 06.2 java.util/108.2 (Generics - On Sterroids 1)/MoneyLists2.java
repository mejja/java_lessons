import java.util.ArrayList;
import java.util.List;

 public class MoneyLists2 {
	public static void main(String[] args) {
		List<Money> list2 = new ArrayList<Money>();
		
		list2.add(new Money(Currency.USD, 10));
		list2.add(new Money(Currency.USD, 10));
		list2.add(new Money(Currency.USD, 10));
		list2.add(new Money(Currency.USD, 10));
		list2.add(new Money(Currency.USD, 10));
	
		System.out.println("list2 = "+list2);
	}
}
