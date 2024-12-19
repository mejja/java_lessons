public class Question53 {
	int x(String d) {
		System.out.println("one");
		return 0;
	}
	String x(int d) {
		System.out.println("two");
		return null;
	}
	double x(double d) {
		System.out.println("three");
		return 0.0;
	}
	double x(double d, int y) {
		System.out.println("four");
		return 0.0;
	}
	public static void main(String[] args) {
		new Question53().x(4.0);
	}
}