import java.util.*;
public class TestClass{
	public static void main (String[] args) {
		Queue<String> products = new ArrayDeque<String> ();
		products.add ("pl");
		products.add ("p2");
		products.add ("p3");
		System.out.print (products.peek ());
		System.out.print (products.poll());
		System.out.println ("");
		products. forEach (s -> System.out.print (s) );
	}
}