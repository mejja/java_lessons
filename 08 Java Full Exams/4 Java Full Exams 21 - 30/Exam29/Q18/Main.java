public class Main {
	public static void main(String args[]) {
	int num = 0;

		switch (num) {
		default:
			System.out.println("default");
		case 0:
			System.out.println("casel");
		case 10 * 2 - 20:
			System.out.println("case2");
			break;
		}
	}
}