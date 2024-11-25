import java.util.*;

public class String2{
	public static void main(String[] args){

	String multiLine = "1,4,3,2,3,7,5,6,9\n"+
                      "8,6,3,7,3,7,5,6,9\n"; 
    //Split the multiLine string into lines
	String[] lines = multiLine.split("\n");
	int[][] array2D =new int[lines.length][];//array declaration same size as string size

	//copying values from string to array
	for(int i=0; i<lines.length;i++){
		String[] values = lines[i].split(",");
		array2D[i]= new int[values.length];
		for(int j=0; j<values.length;j++){
			array2D[i][j]=Integer.parseInt(values[j]);
		}
	}
	//print unsorted array
	System.out.println("Unsorted Array: ");
	for(int[] row:array2D)
		System.out.println(Arrays.toString(row));//convert to string before printing

 	//sorting 2D Array in descending order using bubble sort
 	for(int i=0; i<array2D.length; i++){//iterating outer array
 		for(int j=0;j<array2D[i].length; j++){//iterating inner array
 			//sorting array
 			for(int k=0; k<(array2D[i].length-j-1); k++){
 				if(array2D[i][k]<array2D[i][k+1]){
 					int temp = array2D[i][k];
 					array2D[i][k]=array2D[i][k+1];
 					array2D[i][k+1]=temp;
 				}
 			}

 		}
 	}

	//print sorted array
	System.out.println("Sorted Array: ");
	for(int i=0; i<array2D.length; i++){
		System.out.print("[");
		for(int j=0; j<array2D[i].length; j++){
			System.out.print(array2D[i][j]);
			System.out.print(",");
		}
		System.out.print("]");
		System.out.println(" ");
	}

	}
 
}
