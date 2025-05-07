import java.util.LinkedList;

public class TestLinkedListSize{
	public static void main(String[] args){
		LinkedList<Integer> stack = new LinkedList<>();

		//stack size before pushing element
		System.out.println("Stack Size: "+ stack.size());

		//Adding elements
		stack.push(1);
		stack.push(2);
		stack.push(3);

		//Printing stack size after pushing elements
		System.out.println("Stack size: "+stack.size());
	}
}