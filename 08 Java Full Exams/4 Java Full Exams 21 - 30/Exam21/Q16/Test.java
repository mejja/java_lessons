class Test{
	public static void main(String[ ] args){
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 2, 3, 1, 0 };
		System. out.println( a [ (a = b) [3] ] );
	}
}
//What will it print when compiled and run?