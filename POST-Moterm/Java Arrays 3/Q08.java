import java.util.*;

public class Q08{
	public static void main(String[] args){
		String [] a = new String[] {"a","e","i","o","u"};
		String [] b = new String[3];

		System.arraycopy(b, 0, a, 0, b.length);

		for(int i = 0; i<a.length; i++){
			System.out.print(a[i] + ", ");
		}
	
	}

}