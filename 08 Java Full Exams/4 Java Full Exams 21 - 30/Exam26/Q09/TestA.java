public class TestA {
	public static void main (String[] args) {
		Alpha refl = new Alpha (50) ;
		Alpha ref2 = new Alpha (125) ;
		Alpha ref3 = new Alpha (100);
		refl. doPrint ();
		ref2.doPrint ();
		ref3.doPrint ();
	}
}
class Alpha {
	int ns;
	static int s;
	Alpha (int ns){
		if (s < ns) {
			s = ns;
			this.ns = ns;
		}
	}
	void doPrint () {
		System. out. println ("ns = " + ns + " s = " + s) ;
	}
}
//What will the following code print?


