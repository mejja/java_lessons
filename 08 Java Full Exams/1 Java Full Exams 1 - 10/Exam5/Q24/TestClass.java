import java .util.*; 
public class TestClass{
	public static void main(String[] args){
		List s1 = new ArrayList( );
		s1.add("a");
		s1.add("b");
		s1.add("c");
		s1.add("a");
		System.out.println(s1.remove("a")+" "+s1.remove("x"));
	}
}