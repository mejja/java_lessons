public class FinallyTest {
	public static void main(String[] args) {
		try {
		if (args.length < 1) throw new IllegalArgumentException
		("Insufficient arguments");
				System.out.println("Arguments received");
		} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
		} finally {
				System.out.println("Execution completed");
		}
	}
}