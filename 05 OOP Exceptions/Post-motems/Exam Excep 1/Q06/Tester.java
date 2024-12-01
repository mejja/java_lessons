//import java.io.IOException;

public class Tester {
	public static void main(String[] args) {
		new Son(); // line 17
	}
}
class Father {
	public Father() throws RuntimeException {
		System.out.println("Father");
		throw new RuntimeException();
	}
}
class Son extends Father {
	public Son() throws RuntimeException {
		System.out.println("Son");
	}
}

