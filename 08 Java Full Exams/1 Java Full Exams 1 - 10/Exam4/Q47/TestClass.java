public class TestClass{
	public static void main (String args [ ] ) {
		A ol = new C();
		B o2 = (B) ol;
		System.out.println (ol.ml() );
		System.out.println(o2.i);
	}
}

class A { int i = 10; int ml( ) { return i; } }
class B extends A { int i = 20; int ml () { return i; } }
class C extends B { int i = 30; int m1 () { return i; } }


