import java.util.*;

public class Q01{
	public static void main(String[] args){
	int[] scores1 = {1,2,3,4,5,6};
	int[] scores2={0,0,0,0,0,0};
	String[] sA = new String[1];
	sA[0]="aaa";
	int index = 1;
	String[] strArr = new String[5];
	String myStr = strArr[index];

	System.arraycopy(scores2, 2, scores1,3,2);
	for(int i :scores2)
	// System.out.print(i);

System.out.print(myStr);
	}
}