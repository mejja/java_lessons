import java.util.Random;
public class Sorting1{
	public static void main(String[] args){

		Random rand= new Random();
		//Array declaration
		int[] array = new int[50];

		//Array population using a for loop
		for(int i=0; i<array.length;i++){
			if(i!=20 && i!=21)
				array[i]=rand.nextInt(50);
			else if(i==20 || i==21)
				if(i==20)
				    array[i]=60;
			    else 
					array[i]=61;
		}			

		//Printing array values with for loop
		System.out.print("Array Values: [" );
		for(int num: array)
			System.out.print(num+ ",");
		System.out.print("]" );
	}

}