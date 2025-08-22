import java.util.ArrayList;
import java.util.List;

public class MoneyLists4{
	public static void main(String[] args){
		List<Money> list4 = new ArrayList<Money>();

		list4.add(new Money(Currency.USD, 10));
		list4.add(new Money(Currency.USD, 10));
		list4.add(new Money(Currency.USD, 10));
		list4.add(new Money(Currency.USD, 10));
		list4.add(new Money(Currency.USD, 10));
		list4.add(new Money(Currency.GBP, 5));
		list4.add(new Money(Currency.GBP, 5));
		list4.add(new Money(Currency.GBP, 5));
		list4.add(new Money(Currency.GBP, 5));
		list4.add(new Money(Currency.GBP, 5));
		list4.add(new Money(Currency.GBP, 5));
		list4.add(new Money(Currency.GBP, 5));
		list4.add(new Money(Currency.ZAR, 1));
		list4.add(new Money(Currency.ZAR, 1));
		list4.add(new Money(Currency.ZAR, 1));
		list4.add(new Money(Currency.ZAR, 1));
		list4.add(new Money(Currency.ZAR, 1));
		list4.add(new Money(Currency.ZAR, 1));

		System.out.println("list4 = "+list4);
	}
}