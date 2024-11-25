import java.util.Arrays;
public class Arrays2Basics4{
	public static void main(String[] args){
		int[] arr = new int [50];
		for(int i=0; i< arr.length; i++){
			arr[i]= i+1;
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		System.out.println("Array Values + 1");
		for(int j=0; j< arr.length; j++){
			int increment= arr[j]+1;
			System.out.print(increment + " ");
		}
		  System.out.println(" ");
	System.out.println(Arrays.toString(arr));
	}
}