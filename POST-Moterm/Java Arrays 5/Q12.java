import java.util.*;

public class Q12{
	public static void main(String[] args){
		int[] array = {1,4,3,6};
		spread(array);
		

		for(int i :array)
			System.out.println(array[i]);

	}
	public  static void spread(int[] values){
		for(int index=1; index<values.length; index++)
			values[index] = values[0];
	}

}