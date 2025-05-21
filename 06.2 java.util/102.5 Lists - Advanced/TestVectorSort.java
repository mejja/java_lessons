import java.util.Vector;
import java.util.Collections;
import java.util.List;

public class TestVectorSort{
	public static void main(String[] args){
		Long[] numerals ={10L,5L,7L,2L,8L};
		Vector<Long> stack= new Vector<>();

		Collections.addAll(stack, numerals);
		System.out.println("Unsorted Vector:"+stack);
		Collections.sort(stack);
		System.out.println("Sorted Vector:"+stack);
	}
}