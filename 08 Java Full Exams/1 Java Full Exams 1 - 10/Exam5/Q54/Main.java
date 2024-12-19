import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
	List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

	StringProcessor reverser = s -> new StringBuilder(s).reverse().toString();
	System.out.println(reverser.process("Hello"));

	names. forEach (name -> System.out.println(name) );

	Predicate<String> startsWithC = s -> s.startsWith("C");
	Predicate<String> lengthGreaterThan4 = s -> s. length() > 4;

	System.out.println("Names starting with C:");
	printFiltered(names, startsWithC);

	System.out.println("Names longer than 4 characters:");
	printFiltered(names, lengthGreaterThan4);

	System.out.println("Names starting with C or longer than 4 characters:");
	printFiltered(names, startsWithC.or(lengthGreaterThan4));
}
	static void printFiltered(List<String> list, Predicate<String> condition) {
		for (String item : list) {
			if (condition.test(item) ) {
				System.out.println(item);
			}
		}
	}
}

@FunctionalInterface
interface StringProcessor {
	String process (String input);
}