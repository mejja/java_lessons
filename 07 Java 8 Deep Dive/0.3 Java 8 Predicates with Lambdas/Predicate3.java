import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate3{
	public static void main(String[] args){
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

		//Defining two predicates
		Predicate<Integer> isGreterThanFive = e -> e >5;
		Predicate<Integer> isLessThanEqualToThree = e -> e <=3;

		//Combining two predicates
		Predicate<Integer> combinedPredicate = isGreterThanFive.or(isLessThanEqualToThree);

		// Use the combined predicate to filter the list
		numbers.removeIf(combinedPredicate.negate());

		//Print filtered results
		System.out.println(numbers);//print all numbers after negation
	}
}