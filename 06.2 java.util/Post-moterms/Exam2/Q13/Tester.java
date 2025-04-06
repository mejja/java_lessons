import java.util.HashSet;
import java.util.Set;

public class Tester{
	public static void main(String[] args) {
		Set<Foo> myFooSet = new HashSet<Foo>();
		myFooSet.add(new Foo(2));
		myFooSet.add (new Foo(1));
		myFooSet.add(new Foo(3));
		myFooSet.add(new Foo(3));
		myFooSet.add(new Foo(2));
		System.out.print(myFooSet.size());
	}
}
class Foo {
	Integer code;
	Foo(Integer c) {
	code = c;
	}
	public boolean equals (Foo f) {
		return false;
	}
	public boolean equals (Object f) {
		return true;
	}
	public int hashCode() {
		return 17;
	}
}