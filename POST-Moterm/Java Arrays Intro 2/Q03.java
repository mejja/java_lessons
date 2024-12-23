import java.util.Arrays;
public class Q03{
	public static void main(String[] args){
		int[] numArray = new int[] {1,2,3,4,5};
		for(int i : numArray){
			i=0;
		}
		System.out.println(Arrays.toString(numArray));

	}
}