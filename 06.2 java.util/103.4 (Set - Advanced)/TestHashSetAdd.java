import java.util.*;

public class TestHashSetAdd{
	public static void main(String[] args){
		HashSet<Long> stack = new HashSet<>();

		stack.add(303L);
		stack.add(101L);
		stack.add(202L);

		System.out.println("The HashSet Is: "+ stack);
	}
}