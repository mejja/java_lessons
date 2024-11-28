import java.util.*;
public class Q17 {
	public static void main(String[] args) {
		int [] array = {1,2,3,4,5};
		System.arraycopy(array, 2, array, 1, 2);
		System.out.print(array[1]);
		System.out.print(array[4]);
		}	
}