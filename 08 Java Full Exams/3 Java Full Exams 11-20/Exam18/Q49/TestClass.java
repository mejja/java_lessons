public class TestClass{
	public static void main(String args []){
		String s = "MINIMUM";
		System.out.println(s.substring(4, 7)); //1
		System. out.println(s.substring(5)); //2
		System. out.println(s.substring(s.indexOf('I', 3))); //3
		System. out.println(s.substring(s.indexOf('I', 4))); //4
	}
}