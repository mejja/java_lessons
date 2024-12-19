public class TestClass{
	public static void main(String[] args) {
		Bandwidth bw = new Bandwidth(100);
		bw.addMore(-bw.getAvailable());
		System.out.println(bw.getAvailable());
	}
}
public class Bandwidth{
	public int available = 0;
	public int getAvailable() {
		return available;
	}
	public Bandwidth(int quota) {
		this. available = quota;
	}
	public void addMore(int more) {
		available += more;
	}
}
