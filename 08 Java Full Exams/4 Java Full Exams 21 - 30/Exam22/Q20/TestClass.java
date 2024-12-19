//Consider the following classes:
public class TestClass {
	public static void main(String[] args) {
		A a = new A() ;
		B b = new B();
	}
}
class A implements Runnable{ ... }
class B extends A implements Observer { ... }
//(Assume that Observer has no relation to Runnable.)

//Which of the following Java code fragments will compile and execute without throwing exceptions?