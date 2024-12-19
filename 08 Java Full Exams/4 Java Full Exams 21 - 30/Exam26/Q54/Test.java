public class Test {
	public static void main (String[] args) {
		X xobj = new x();
		xobj.printFileContent ();
	}
}

class x {
	public void printFileContent () {
		/* code goes here */
		throw new IOException () ;
	}
}
/* which two modifications should you make so that the code compiles successfully?
A) Replace line 8 with public static void main(String[] args) throws Exception {
B) Replace line 10 with:
try {
xobj.printFileContent ();
}
catch (Exception e) {}
catch (IOException e) { }
C) Replace line 2 with public void printFileContent () throws IOException {
D) Replace line 4 with throw IOException ("Exception raised") ;
E) At line 11, insert throw new IOException () ;
*/
