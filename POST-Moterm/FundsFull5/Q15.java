public class Q01{
	static void It(int[] z){
	z=null;
	}
	public static void main (String[] args){
	int[] myArray = {1,2,3,4,5};
	It(myArray);

	for(int j=0; j<myArray.length; j++)
		System.out.print( myArray[j] + " ");
	}
}