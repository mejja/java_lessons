import java.util.*;
public class TestClass{
	public static void main (String args[]){
		int i1 = 1, i2 = 2, i3 = 3;
		int i4 = i1 + (i2=i3 );
		System.out.println(i4);
	}
}