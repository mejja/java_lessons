//Test.java:
//package p2;
//import p1.Acc;
public class Test extends Acc {
	public static void main (String[] args) {
		Acc obj = new Test ();
	}
}

// package pl;
public class Acc {
	int p;
	private int q;
	protected int r;
	public int s;
}

/*Which of the below statements are true
A. Both p and s are accessible by obj.
B. Only s is accessible by obj.
C. Both r and s are accessible by obj.
 
D. p, r, and s are accessible by obj.*/
