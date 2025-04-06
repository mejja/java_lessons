import java.util.LinkedList;

public class TestLinkedListGet{
	public static void main(String[] args){
		LinkedList<String> stack = new LinkedList<>();

		//Adding elements
		stack.push("Zero");
		stack.push("First");
		stack.push("Second");

		//Getting stack element at index 1
		System.out.println("Stack size: "+ stack.get(1));
	}
}