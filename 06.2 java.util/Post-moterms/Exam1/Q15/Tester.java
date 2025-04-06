import java.util.Arrays;
public class Tester{
	public static void main(String[] args) {
		String[] arr = { "java", "champ", "champion" };
		Arrays.sort (arr);
		System.out.print(Arrays.binarySearch(arr, "champion"));
		System.out.print (Arrays.binarySearch(arr, "You"));
	}
}