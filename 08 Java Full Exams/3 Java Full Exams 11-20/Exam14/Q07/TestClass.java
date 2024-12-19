public class TestClass{
	public static void main (String args [ ] ) {
		double amount= _1_2.0_0;//compilatiion error underscore before number
		double amount2= 1_2_.0 //underscore after non-decimal number
		double amount3= 1_2.0_ //underscore after decimal number.
		System.out.println(amount);
	}
}