public class TestClass{
	public static void main(String[] args){
		int x=1;
		boolean bool;
		if (8 == 81) {}//A)
		//if (x = 3) {} // assume that x is an int //B)
		if (true) {}//C)
		if (bool = false) {}  //assume that bool is declared as a boolean //D)
		if (x == 10 ? true:false) { } // assume that x is an int //E)
	}
}