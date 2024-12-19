public class B3 extends A {
	int x = 15;
	public static void main(String[] args) {
		A a = new B3();
		System.out.println(a.x);
	}
	int initialize() {
		return 20;
	}
}


class A {
	int x = 5;
	A() {
		initialize();
	}
	int initialize() {
		return 10;
	}
}
