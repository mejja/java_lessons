public class MyClass {
	public static void main(String[] args) {
		int [] array1;
		int [] array2 = new int [3];
		char [] array3 = {'a', 'b'};
		array1 = array2;
		System.out.println(array1[0] +":"+ array2[1]);
	}
}