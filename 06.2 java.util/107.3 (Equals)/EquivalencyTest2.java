 public class EquivalencyTest2 {
	public static void main(String[] args) {
		
		String a = new String("a");		
		String b = new String("a");
		
		boolean result1 = a.equals(b);
		boolean result2 = b.equals(a);
		
		System.out.println("Result1 = "+result1);
		System.out.println("Result2 = "+result2);
	}
}
