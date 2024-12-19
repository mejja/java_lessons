package p2;
import p1.Acc;

public class Test extends Acc {
	public static void main (String[] args) {
		Acc obj = new Test () ;
		Test obj2 = new Test () ;
		System.out.println(obj2.r);
		System.out.println(obj.s);
	}
}