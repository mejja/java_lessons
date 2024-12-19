public class Test{
	public static void main (String[] args) {
		A a = new A();
		B b = new B();
		
		//tests
		a=(B)(I)b;
		b = (B)(I)a;
		a=(I)b;
		I i =(C)a;
	}
}
interface I{}
class A implements I{}
class B extends A {}
class C extends B{}
