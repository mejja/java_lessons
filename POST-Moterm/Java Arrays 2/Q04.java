import java.util.*;

public class Q04{
	public static void main(String[] args){
	int[1][1] array2D;
	int[] scores = {1,2,3,4,5,6};
	System.arraycopy(scores, 2, scores, 2,2);
	for(int i: scores)System.out.print(i);
	}

}