public class Tester {
	public static void main(String[] args) {
		int x = 0;
		int i = 1;
		for (; i > 0; i -- )
		if ((++x>0) | ( -- i > 0))
		x++;
		System.out.println(x + "" +i);
	}
}