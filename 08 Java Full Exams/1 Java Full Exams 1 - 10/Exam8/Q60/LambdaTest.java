import java.util. function. Predicate;
import java.util.ArrayList;

class LambdaTest {
	public static void main(String[] args) {
		int[] numbers = {7, 8, 9, 10, 11};
		Predicate<Integer> num = n -> n > 8;

		ArrayList<Integer> results = new ArrayList<>();
		for (int n : numbers) {
			if (num.test(n)) {
				results.add(n);
			}
		}
		int sum = 0;
		for (int n : results) {
			sum += n;
		}
		System.out.print(sum);
	}
}