public class test {
	public static void main(String []args) {
		StringBuilder numbers =new StringBuilder("0123456789");
		numbers.delete(2,6);
		numbers. append ("-") .insert(2, "").insert(3,"+");
		System. out.print (numbers);
	}
}