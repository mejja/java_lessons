import java.util.LinkedList;

public class TestLinkedListPush{
	public static void main(String[] args){
		LinkedList<String> stack = new LinkedList<>();

		//Push elements
		stack.push("First");
		stack.push("Second");

		//Print stack elements
		System.out.println("Stack elements after pushing: "+ stack);
	}
}