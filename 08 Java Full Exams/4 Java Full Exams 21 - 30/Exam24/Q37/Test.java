public class Test {
	public static void main (String[] args) {
		int x = 10;
		int y = 2;
		try {
			for (int z = 2; z >= 0; z -- ) {
				int ans = x / z;
				System. out.print (ans+ " ") ;
			}
		} catch (Exception el) {
			System.out.println ("E1");
		} catch (ArithmeticException el) {
			System.out.println ("E2");
		}
	}
}