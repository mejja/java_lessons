import java.util.HashMap;
import java.util.Map;

public class MapsEg2 {
	public static void main(String[] args) {
		
		Map<String, Money> shareMap = new HashMap<String,Money>();
		
		shareMap.put("Mr Sly",new Money(Currency.USD, 1000));
		shareMap.put("Mr Slicko",new Money(Currency.USD, 1000));
		shareMap.put("Mr No3",new Money(Currency.USD, 1000));
		shareMap.put("Mr John",new Money(Currency.USD, 1000));
		
		System.out.println("shareMap = "+shareMap);
	}
}
