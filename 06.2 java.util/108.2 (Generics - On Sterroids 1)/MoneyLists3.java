import java.util.ArrayList;
import java.util.List;

public class MoneyLists3{
	public static void main(String[] args){
		List<Money> list3 = new ArrayList<Money>();

		list3.add(new Money(Currency.USD, 10));
		list3.add(new Money(Currency.USD, 10));
		list3.add(new Money(Currency.USD, 10));
		list3.add(new Money(Currency.USD, 10));
		list3.add(new Money(Currency.USD, 10));
		list3.add(new Money(Currency.GBP, 5));
		list3.add(new Money(Currency.GBP, 5));
		list3.add(new Money(Currency.GBP, 5));
		list3.add(new Money(Currency.GBP, 5));
		list3.add(new Money(Currency.GBP, 5));
		list3.add(new Money(Currency.GBP, 5));
		list3.add(new Money(Currency.GBP, 5));

		System.out.println("list3 = "+list3);
	}
}