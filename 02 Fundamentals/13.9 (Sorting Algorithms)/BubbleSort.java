import java.util.Arrays;

public class BubbleSort{
	public static void main(String[] args){

		int[] unsortedArray = {10,5,15,25,8,2};
		 System.out.println(Arrays.toString(unsortedArray));

	 	int length =unsortedArray.length;

	 	for (int i=0; i<length-1; i++)
	 	{
	 		for(int j = 0; j<(length-1)-i;j++){

	 			if(unsortedArray[j]> unsortedArray[j+1])
	 			{ 
	 			int num = unsortedArray[j];
	 			unsortedArray[j]=unsortedArray[j +1];
	 			unsortedArray[j+1]=num;	
	 			}
	 			
	 		}
	 	}
	 	System.out.println("The Sorted Array is: ");
	 	for (int numbers: unsortedArray){
	 		System.out.print(numbers);
	 		System.out.print(" ");
	 	}
	}	
}