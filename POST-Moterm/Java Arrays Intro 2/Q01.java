public class Q01{
	public static void main(String[] args){
		int myArray = {1,2,3,4,5};

		ChangeIt.doIt(myArray);

		for(int j=0; j<myArray.length; j++)
			System.out.print(myArray[j] + " ");
	}
	class ChangeIt{
		static void doIt(int[] z){
			int[] A = z;
			A[0] =99;
		}
	}
}