public class TestClass{
	public static void main (String[] args) {
		String a = "java";
		char [] b = { 'j', 'a', 'v', 'a' };
		String c = new String (b);
		String d = a;

		System.out.println(a == d);
		//System.out.println(b == d);
		System.out.println(a == "java");
		System.out.println(a.equals(c));
	}
}