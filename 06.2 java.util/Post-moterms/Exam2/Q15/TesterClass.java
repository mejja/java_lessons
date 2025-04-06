import java.util.Arrays;
public class TesterClass {
	public static void main(String[] args) {
		String [] arr = {"java", "champ", "champion"};
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, "champion"));
		System.out.println(Arrays.binarySearch(arr, "java"));
	}
}