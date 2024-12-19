public class DoCompare4 {
	public static void main(String[] args) {
		String[ ] table = {"dd", "oo", "pp"};
		int temp =0;

		do
			while (temp < table.length)
				System.out.print((temp++)+" ");
			while (temp < table.length);
	}
}