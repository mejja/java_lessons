import java.util.*;

public class TestLinkedListAdd{
	public static void main(String[] args){
		LinkedList<Long> stack = new LinkedList<>();

		stack.add(303L);
		stack.add(101L);
		stack.add(202L);

		System.out.println("The LinkedList Is: "+ stack);
	}
}