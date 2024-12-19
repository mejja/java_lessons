//File B.java
package b;
import a.*;
public class B extends A{
	public void print () { System.out.println ("B") ; }
		public static void main (String [] args) {
		new B () ;
	}
}