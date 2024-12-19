public class TestClass{
	public static void main(){
		A a = new A() ; //1
		A b = new B() ; //2
		System.out.println(b.i);// will print 20
	}
}
class A{
	private int i = 10;
	public void f() {}
	public void g() { }
}
class B extends A{
	public int i = 20;
	public void g() {}
}
