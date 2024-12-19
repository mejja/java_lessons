public class MyClass {
	public static void main(String[] args) {
		try {
			doStuff();
			system.out.println("1");
		}
		catch {
			system.out.println("2");
		}
	}
	public static void do Stuff() {
		if (Math.random() > 0.5) throw new RunTimeException();
		doMoreStuff();
		System.out.printin("3 ");
	}
	public static void doMoreStuff() {
		System.out.println("4");
	}
}