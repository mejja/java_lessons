class MyClass{
	public static void main (String[] args) {
		int [][] array2D =new int[3][2];
		int count = 0;
		for (int i=0; i < array2D.length; i++) {
			for (int j= 0; j < array2D[i].length; j++) {
				++count;
			}
		}
		System.out.println("count "+count);
	}
}