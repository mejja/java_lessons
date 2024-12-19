import java.util. function. BiPredicate;
import java.util.ArrayList;

class LambdaTest {
	public static void main(String[] args) {
		int[] numbers = {9, 2, 3, 15, 5, 25, 3};
		BiPredicate<Integer, Integer> isDivisible = (n, d) -> n % d == 0;

		ArrayList<Integer> myArray = new ArrayList<>();
		for (int n : numbers) {
			if (isDivisible.test(n, 3)) {
				myArray.add(n);
			}
		}
		int res = 1;
		for (int n : myArray) {
			res += n;
		}
		System.out.println(myArray);
		System.out.println(res);
	}
}