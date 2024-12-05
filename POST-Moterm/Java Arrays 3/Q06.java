import java.util.*;

public class Q06{
	public static void main(String[] args){
		String [] a = new String[] {"a","e","i","o","u"};
		String [] b = new String[3];

		System.arraycopy(b, 0, a, 0, a.length-3);

		for(int i = 0; i<a.length; i++){
			System.out.print(a[i] + ", ");
		}
	
	}

}