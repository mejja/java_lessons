import java.util.*;

public class Q01{
	public static void main(String[] args){
		int [] a = new int[] {1,3,14,19,0};
		int [] b = new int[]{5,8,9,17,0,0,0,67,35};

		System.arraycopy(b, 3, a, 0, 5);

		for(int i = 0; i<a.length; i++){
			System.out.print(a[i] + ", ");
		}
	
	}

}