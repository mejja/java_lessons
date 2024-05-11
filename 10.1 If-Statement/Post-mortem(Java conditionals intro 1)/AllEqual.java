public class AllEqual{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		if (a == b && a ==c)
		{
			System.out.println("all equal");
		}
		else {
			System.out.println("not all equal");
		}
		// ArrayIndexOutOfBoundsException when you don't provide command-line arguments during run
		//error occurs because the program tries to access elements of the args array which doesn't exist due to the lack of command-line arguments.
	}
}