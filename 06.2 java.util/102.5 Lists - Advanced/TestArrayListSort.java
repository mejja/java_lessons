import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestArrayListSort{
	public static void main(String[] args){
		Long[] numerals ={10L,5L,7L,9L,8L};
		ArrayList<Long> stack = new ArrayList<>();

		Collections.addAll(stack, numerals);

		System.out.println("Unsorted ArrayList:"+stack);
		Collections.sort(stack);
		System.out.println("Sorted ArrayList:"+stack);
	}
}