import java.util.LinkedList;

public class TestLinkedListPop{
	public static void main(String[]  args){
	 	LinkedList<String> stack = new LinkedList<>();

	 	// Add elements to the LinkedList
	 	stack.push("First");
        stack.push("Second");
	 	stack.push("Third");

	 	//Printing stack before popping
	 	 System.out.println("Stack contents: " + stack);
	 	 // Pop elements from the stack and print them
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        // Printing the stack contents after popping
        System.out.println("Stack contents after pops: " + stack);
	}
}