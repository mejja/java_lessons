public class TestClass{
	public static void main(String[] args){
	String str1= "hello world".trim();
	String str2= ("hello"+ new String("world"));
	String str3= "hello".concat(" world");
	String str4= new StringBuilder("world").insert(0, "hello ").toString();
	String str5= new StringBuilder("world").append(0, "hello ").toString();//error append doesnt take two args(int, String)
	String str6= new StringBuilder("world").append("hello", 0, 10).toString();//IndexOutOfBoundsException
	String str7= new StringBuilder("world").add(0,"hello").toString();//no add() method in StringBuilder


	System.out.println(str1);
	System.out.println(str2);//won't leave spacing
	System.out.println(str3);
	System.out.println(str4);
	}
}