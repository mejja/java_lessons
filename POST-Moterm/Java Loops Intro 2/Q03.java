public class Q03 {
	public static void main(String[] args) {
		int j=6, i = 0;
		System.out.print("Now i value and j value: ");
		for (int x = 1; i < ++x; i += x, j -= x){//use previous values
			System.out.print(i+" "+j+", ");
			}
	}
}
