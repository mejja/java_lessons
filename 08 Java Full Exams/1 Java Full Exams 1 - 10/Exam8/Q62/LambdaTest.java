import java.util. function. Predicate;
import java.util.ArrayList;

class LambdaTest {
	public static void main(String[] args) {
		int[][] nums = {{1,2, 3}, {4, 5, 6}, {7,8,9}};
		Predicate<Integer> result = n -> n % 2 == 0;

		ArrayList<Integer> myNums = new ArrayList<>();
		for (int[] row : nums) {
			for (int n : row) {
				if (result.test(n)) {
					myNums. add(n);
				}
			}
		}
		int max = Integer.MIN_VALUE;
		for (int n : myNums) {
			if (n > max) {
				max = n;
			}
		}
		System.out.println(myNums);
		}
}