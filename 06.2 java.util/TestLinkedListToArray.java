import java.util.LinkedList;
import java.util.Arrays;

public class TestLinkedListToArray{
	public static void main(String[] args){
		LinkedList<String> stack = new LinkedList<>();

		//Adding elements
		stack.push("Zero");
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		stack.push("Fourth");

		//Getting stack element as array
		System.out.println("Stack elements: " + Arrays.toString(stack.toArray()));
	}
}