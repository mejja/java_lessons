public class CodeAlong5{

	public static void count(int[] arr){
		for(int i=0; i<arr.length; i++){
			arr[i]=i+1;
		}
	}
	//printing
	public static void print(int[] arr){
		for(int number: arr){
			System.out.print(number+",");
		}
	}
	public static void main(String[] args){
		int[] myArray = new int[25];
		count(myArray);
		print(myArray);
	}
}