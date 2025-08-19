import java.util.ArrayList;
import java.util.List;

 public class MoneyLists1 {
	public static void main(String[] args) {
		List<Money> list1 = new ArrayList<Money>();
		
		list1.add(new Money(Currency.GBP, 20));
		list1.add(new Money(Currency.GBP, 20));
		list1.add(new Money(Currency.GBP, 20));
		
		System.out.println("list1 = "+list1);
	}
}
