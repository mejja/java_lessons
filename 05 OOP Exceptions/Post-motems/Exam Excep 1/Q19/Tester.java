public class Tester {
	public static void main(String[] args) {
		String stmt = "javachamp 2009";
		String[] arr = stmt.split(" ");
		try {
			int x = Integer.parseInt(arr[0]);
			System.out.print(x);
		} catch (Exception e) {
			System.out.print("catch");
		} finally {
			System.out.print("finally");
		}
	}
}