public class Tester{
	public static void main(String[] args) {
		Foo fool = new Foo(1);
		Foo foo2 = new Foo(2);
			System.out.print(fool.equals(foo2));
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
}