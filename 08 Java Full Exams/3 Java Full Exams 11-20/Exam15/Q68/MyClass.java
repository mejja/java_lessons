import java.util.*;
public class MyClass {
	public static void main(String[] args) {
		ArrayList<String> List = new ArrayList<>();
		List.add("SE");
		List.add("EE");
		List.add("ME");
		List.add("SE");
		List.add("EE");

		List.remove( "SE") ;

		System.out.println("Values are : " + List);
	}
}