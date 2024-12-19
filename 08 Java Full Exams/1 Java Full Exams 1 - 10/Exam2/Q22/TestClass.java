public class TestClass {
	public static void main (String [] args) throws Exception {
		int[ ] i[ ] = { { 1, 2 }, { 1 }, { }, { 1, 2, 3 } } ;//A
		int i[ ] = new int[2] {1, 2} ;//B
		int i[ ][ ] = new int[ ][ ] { {1, 2, 3}, {4, 5, 6} } ;//C
		int i[ ][ ] = { { 1, 2 }, new int[ 2 ] } ;//D
		int i[4] = { 1, 2, 3, 4 } ;//E

	}
}