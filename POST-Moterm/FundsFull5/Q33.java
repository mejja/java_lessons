import java.util.*;
public class Q33{
	public static void main (String[] args){
		int [] src = new int[]{1,3,14,19,0};
		char[] dest = new char[6];

		for(int i=0; i<dest.length; i++){
			dest[i] ='?';
		}
		System.arraycopy(src, 5, dest, 0, 1);
		for(int i=0; i<dest.length; i++){
			System.out.print(dest[i]);
		}

	}
}