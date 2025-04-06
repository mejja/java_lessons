import java.util.Arrays;
public class Tester {
	public static void main(String[] args) {
		String[] arr = { "Three", "One", "One", "Zero" };
		System.out.println(Arrays.binarySearch(arr, "Zero"));
		System.out.println(Arrays.binarySearch(arr, "One"));
		System.out.println(Arrays.binarySearch(arr, "One"));
	}
}