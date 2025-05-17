import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class TestLinkedListAddFirst{
	public static void main(String[]  args){
		//Linked List
		LinkedList<String> stack = new LinkedList<>();
		// Add elements to the LinkedList
	 	stack.push("First");
        stack.push("Second");
	 	stack.push("Third");

		System.out.println("Vector before set:"+stack);
		stack.addFirst("JAVA");

		//Create a synchronized view of the stack
		List<String> synchronizedList = Collections.synchronizedList(stack);
		// Now you can safely access and modify the list from multiple threads
		synchronized (synchronizedList){
			for(String i : synchronizedList){
				System.out.println(i);
			}
		}
	}
}