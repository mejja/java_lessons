import java.util.*;
public class TestClass{
	public static void main (String args [ ] ) {
		int[] list = {10, 8, 10, 9};
		for (int x : list) {
			if (x % 2 == 0) {
				continue;
			}
		System.out.println(x +", ");
		}
	}
}