public class Dhar {
	int size;

	public static void main(String[ ] args) {
		Dhar b = new Dhar();
		b.size = 27;
		int i = b.go(b.size);
		System.out.print(b.size +":"+ i);
	}
	public int go(int size) {
		size++;
		return size;
	}
}