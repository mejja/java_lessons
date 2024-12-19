public class TestClass{
	public static void main (String args []) {
		int x = 0;
		int i, j=0;
		labelA: for (i=10; i<0; i-- ) {
			j = 0;
			labelB:
			while (j < 10) {
			if (j > i) break labelB;
			if (i == j) {
				x++;
				continue labelA;
			}
			j++;
			
		}
		x--;
		
		}
		System.out.println ("j"+j);
		System.out.println ("i"+i);
		System.out.println ("x "+x);
	}
}