public class ArrayTest {
	private static Integer[][] ia = {{1, null}, {3, 4}, null};

	private static Integer getElement(int i, int j) {
		try {
				return ia[i][j];
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
				return 28;
		}
	}
	private static void setElement(int i, int j, Integer value) {
	try {
			ia[i][j] = value;
	} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Unable to set element at [" + i + "][" + j + "]");
	}
	}
	public static void main(String[] args) {
		setElement(0, 1, 2);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(getElement(i, j) + " ");
					break;
				}
			}
	}
}