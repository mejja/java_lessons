import java.lang.*;
import java.util.*;

public class CodeAlong7{
	public static void main(String[] args){
		int [] arr = new int [100];
		Random rand = new Random();
        //Array population
		for(int i=0;i<arr.length;i++){
			arr[i]=rand.nextInt(100);
		}
		//Array printing
		System.out.println("Main Array: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		//subarray copying
		int[] subArr= Arrays.copyOfRange(arr, 15,31);

		//Printing subarray
		System.out.println(" ");
		System.out.println("Sub-Array: ");
		for(int values: subArr)
			System.out.print(values + " ");
	}

}