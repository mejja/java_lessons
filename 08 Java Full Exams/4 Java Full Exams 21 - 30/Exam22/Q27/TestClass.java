import java.util.*;
public class TestClass{
	public static void main(String args[]){
		A[] a, a1;
		B[] b;
		a = new A[10]; a1 = a;
		b = new B[20];
		a = b; // 1
		b =  a; // 2
		//b = (B[]) a1; // 3
	}
}
class A { }
class B extends A { }
//Given the following program, which statements are true?