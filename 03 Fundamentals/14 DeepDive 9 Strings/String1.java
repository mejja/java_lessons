import java.util.*;

public class String1{
	public static void main(String[] args){

	String line = "1,4,3,2,3,7,5,6,9"; 
	String[] parts = line.split(",");
	int[] array =new int[parts.length];//array declaration same size as string size

	//copying values from string to array
	for(int i=0; i<array.length;i++)
		array[i]=Integer.parseInt(parts[i]);
	//print unsorted array
	System.out.print("Unsorted Array: ");
	for(int x: array)
 		System.out.print(x+",");
    System.out.println(" ");


 	//sorting in descending order
	for(int i=0;i<array.length;i++){
		for(int j=i+1; j<array.length;j++){
			if(array[i]<array[j]){
				int temp = array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
	}

	//printsorted array
	System.out.print("Sorted Array: ");
	for(int x: array)
 	System.out.print(x+",");


	}
 
}
