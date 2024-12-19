public class TestClass{
	public static void main(String[] args){
		A a = new A();
		B b = new B();
	}
}

interface I{
}
class A implements I{
}
class B extends A {
}
class C extends B{
}

//Identify options that will compile and run without error.