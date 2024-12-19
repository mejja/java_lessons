public class TestClass{
	public static void main(String[] args){
		A a = new A();
		B b = new B();

		a = (B)(I)b;
		b = (B)(I) a;
		a= (I)b;
	}
}

interface I{

}
class A implements I{

}
class B extends A{

}
class C extends B{

}