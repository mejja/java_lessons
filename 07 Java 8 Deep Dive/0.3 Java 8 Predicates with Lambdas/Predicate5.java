import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate5{
	public static void main(String[] args){
		List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry","Banana"));

		//Define a predicate that checks if a fruit is equal to "Banana"
		Predicate<String> isBanana = Predicate.isEqual("Banana");

		//remove if true
		fruits.removeIf(isBanana);

		//print filtered list
		System.out.println(fruits);//[Apple, Cherry]
	}
}