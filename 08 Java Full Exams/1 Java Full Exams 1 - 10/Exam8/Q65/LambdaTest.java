import java.util. function. Predicate;
import java.util.ArrayList;

class LambdaTest {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		Predicate<Integer> isOdd = n -> n % 2 != 0;

		ArrayList<Integer> oddNumbers = new ArrayList<>();
		for (int n : numbers) {
			if (isOdd.test(n)) {
				oddNumbers.add(n);
			}
		}
		int sum = 0;
		for (int n : oddNumbers) {
			sum += n;
		}
		System.out.println("Odd numbers: " + oddNumbers);
		System.out.println("Sum of odd numbers: " + sum);
	}
}