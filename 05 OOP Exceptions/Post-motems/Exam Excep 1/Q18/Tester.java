public class Tester {
	public static void main(String[] args) {
		String stmt = "javachamp 2009";
		String[] arr = stmt.split(" ");
		try {
			int x = Integer.parseInt(arr[1]);
			System. out.print(x);
		} finally {
			System. out.print("finally");
		}
	}
}