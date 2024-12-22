public class Q09 {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
		if (i % (3 * 5) == 0)
		System.out.print("Andhra" +",");
		else if (i % 5 == 0)
		System.out.print("Pradesh" +",");
		else if (i % 3 == 0)
		System.out.print("India"+",");
		else
		System.out.println(i+",");
		}	
	}
}
