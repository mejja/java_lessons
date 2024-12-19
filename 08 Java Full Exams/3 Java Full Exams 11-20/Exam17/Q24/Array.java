public class Array {
	public static void main(String[] args) {
		String s = "hello";
		String t = new String(s);
		if("hello".equals(s) )System.out.print("one");
		if(t == s)System.out.print("two");
		if(t.equals(s) )System.out.print("three");
		if("hello" == s )System.out.print ("four");
		if("hello" == t)System.out.print("five");
	}
}