public class TestClass{
	public static void main(String[] args) { new TestClass().sayHello(); } //1
	public static void sayHello() { System.out.println("Static Hello World") ; } //2
	public void sayHello() { System.out.println( "Hello World "); } //3
}