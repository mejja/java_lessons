import java.util .*;
import java.util.stream .*;

public class StreamTest {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> processedNumbers = numbers.stream()
			.filter(n -> n % 2 == 0)
			.map(n -> n * 2)
			.collect(Collectors.toList());

		System.out.println(processedNumbers);
	}
}