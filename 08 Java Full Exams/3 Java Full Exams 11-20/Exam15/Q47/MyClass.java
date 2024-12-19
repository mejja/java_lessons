public class MyClass {
	static void doubling (Integer ref, int py){
		ref = 20;
		py = 20;
	}
	public static void main(String[] args) {
		Integer i0bj = new Integer( 10);
		int iVar = 10;
		doubling(i0bj++, iVar++);
		System.out.println(i0bj + ", " + iVar);
	}
}