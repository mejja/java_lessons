import java.util.LinkedList;

public class TestLinkedListClear{
	public static void main(String[] args){
		LinkedList<Integer> stack = new LinkedList<>();

		//Adding elements
		stack.push(1);
		stack.push(2);
		stack.push(3);

		//Printing stack before popping
		System.out.println("Stack elements: "+ stack);
		//clearing the stack
		stack.clear();
		//Printing stack after clearing
		System.out.println("Stack after clearing: "+stack);
	}
}