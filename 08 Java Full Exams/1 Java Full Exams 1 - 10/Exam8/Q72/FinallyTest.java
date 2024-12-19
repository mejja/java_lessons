public class FinallyTest {
	public static void main(String[] args) {
		try {
			if (args.length == 0) {
				System.out.println("No arguments");
				return;
		}
				System.out.println("Arguments provided");
		} catch (Exception e) {
				System.out.println("Exception caught");
		} finally {
				System.out.println("Execution finished");
		}
	}
}