public class Runner {
	public static String name = "unknown";
	public void start() {
		System.out.println(name);
	}

	public static void main(Stringl args) {
		name = "Daniel";
		start();
	}
}