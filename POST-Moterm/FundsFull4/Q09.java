public class Q05 {
	static void doIt(int[] z){
		int[] A = z;
		A[0]=99;
	}
	public static void main(String[] args) {
		int[] myArray ={1,2,3,4,5};
		doIt(myArray);
		for(int j=0; j<myArray.length; j++)
		System.out.println(myArray[j]+ " ");
	}
}