public class TestClass{
	public static void main(String args[]){
		String str = "hello";
		String str2 = new String("hello");
		String str3 = str2.concat("");
		System.out.println(str == str2.intern());
		System.out.println(str == str3);
	}
}