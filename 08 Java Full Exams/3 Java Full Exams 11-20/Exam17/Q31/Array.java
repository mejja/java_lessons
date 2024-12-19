public class Array {
	public static void main(String[] args) {
		int total =0;
		StringBuilder letters = new StringBuilder("abcdefg");
		total += letters. substring(1,2) . length () ;
		total += letters.substring(2,3) . length ();
		total += letters.substring(4,6) . length();
		total += letters.substring(5,7) . length();
		System.out.print (total);
	}
}