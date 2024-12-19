class TestClass{
	public static void main (String[] args){
		int[] scores1 = { 1, 2, 3, 4, 5, 6};
		int scores2[] = null;
		System.arraycopy(scores1, 2, scores2, 0, 2) ;
		for(int i : scores2) System.out.print(i) ;
	}
}