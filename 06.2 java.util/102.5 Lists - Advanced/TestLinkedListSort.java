import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class TestLinkedListSort{
	public static void main(String[] args){
		Long[] numerals ={99L,55L,77L,22L,88L};
		LinkedList<Long> stack= new LinkedList<>();

		Collections.addAll(stack, numerals);
		System.out.println("Unsorted LinkedList:"+stack);
		Collections.sort(stack);
		System.out.println("Sorted LinkedList:"+stack);
	}
}