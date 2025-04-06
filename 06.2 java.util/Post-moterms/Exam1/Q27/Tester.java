public class Tester {
	static int i ;
	private static int increment(int i) {
		return i++;
	}
	public Tester() {
		i = 1;
	}
	public static void main(String[] args) {
		System.out.print(i);
		System.out.print(i = increment(i));
	}
}