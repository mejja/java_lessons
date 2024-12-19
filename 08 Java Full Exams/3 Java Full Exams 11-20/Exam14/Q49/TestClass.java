import java.util.*;
public class TestClass{
	public static void main (String args [ ] ) {
		String [] names = {"Tommy", "Mike", "Anthony"};
		//List<String> list = names.asList(); incorrect syntax of converting array to list.
		List<String> list = Arrays.asList(names);
		list.set(0, "Tom");
		System.out.println(names[0]);
	}
}