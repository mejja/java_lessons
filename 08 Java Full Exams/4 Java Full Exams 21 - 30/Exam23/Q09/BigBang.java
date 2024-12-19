abstract class Bang{
	//abstract void f(); //(0)
	final
	//final
	protected static int i;
	private int j;
	void g( ) {}
	void h(){} //(1)
}
final class BigBang extends Bang{
	//BigBang(int n) { m = n; } //(2)
	public static void main(String args []){
		Bang mc = new BigBang();
	}
	void h(){}
		//void k() { i++; } //(3)
		//void 1(){ j++; } //(4)
		int m;
}



/*
Given the following source code, which of the lines that are commented out may be reinserted
without introducing errors?*/
