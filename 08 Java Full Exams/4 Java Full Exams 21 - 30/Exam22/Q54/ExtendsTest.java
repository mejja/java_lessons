public class ExtendsTest{
	public static void main(String args []){
		B b = new B() ;
		B1 b1 = new B1();
		B2 b2 = new B2();
		// insert statement here
		b2 = b;
	}
}
class B {}
class B1 extends B {}
class B2 extends B {}
//Which statements, when inserted in the code below, will cause an exception at run time?