import java.util.*;
public class Q21 {
	public static void main(String[] args){
		String a = "javachamp";
		String b ="javachamp";
		String c = new String("javachamp");
		System.out.print(a==b);
		System.out.print(a==c);
		System.out.print(b.equals(c));
		System.out.print(b.equals(a));
	}
}