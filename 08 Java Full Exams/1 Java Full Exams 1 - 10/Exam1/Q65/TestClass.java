import java.util.*;
public class TestClass{
	public static void main(String[] args){
		A a = new A();
		B b = new B();

		//tests
		boolean test1 = a instanceof T1;
		boolean test2 = a instanceof T2;
		boolean test3 = b instanceof T1;
		boolean test4 = b instanceof T2;
		boolean test5 = a instanceof A;
   System.out.println(test1 +" "+ test2 +" "+  test3 +" "+ test4 +" "+ test5);
	}
}
class A implements T1, T2{}
class B extends A implements T1{}
interface T1 {}
interface T2 {}