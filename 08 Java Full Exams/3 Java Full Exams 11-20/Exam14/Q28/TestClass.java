public class TestClass{
	public static void main (String args [ ] ) {
		StringBuilder b = "rumble";
		b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
		System.out.println(b);
	}
}