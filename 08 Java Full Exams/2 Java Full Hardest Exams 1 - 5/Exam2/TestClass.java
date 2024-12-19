public class TestClass{
	public static void main(String[] args){
		A b = new B();
		System.out.println(b.length);

	}
}
public class A{
	synchronized Double test;
	final int length= 10;

}
public class B extends A{
	int length=20;

}