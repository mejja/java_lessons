import java.util.*;

public class Q14{
	public static void main(String[] args){
		int[] numbers = {12,45,67,8,56,8,34,91,6,72};

		int max = findMax(numbers);

		System.out.println("Maximum value: " + max);
	}

	public static int findMin(int[] arr){
		if(arr.length == 0){
			System.out.println("Array is empty");
		}
		int min = arr[0];
			for(int i=1; i<arr.length; i++){
				if(arr[i]<min){
					min = arr[i];
				}
			}
		return min;
	}


	public static int findMax(int[] arr){
		if(arr.length ==0){
			System.out.println("Array is empty");
		}

		int max = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i] >max){
				max = arr[i];
			}
		}
	return max;
	}

}