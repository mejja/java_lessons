 public class EquivalencyTest3 {
	public static void main(String[] args) {
		String a = new String("a");
		String b = new String("a");
		String c = new String("a");
		
		boolean result1 = a.equals(b);
		boolean result2 = c.equals(b);
		boolean result3 = a.equals(c);
		
		System.out.println("Result1 = "+result1);
		System.out.println("Result2 = "+result2);
		System.out.println("Result3 = "+result3);
		
	}
}
