public class Tester {
	public static void main(String args []) {
		Foldable obj1 = new Paper();
		//obj1.fold(); // line 8
		Paper obj2 = new Paper(); // line 10
		obj2.fold();
	}
}


interface Foldable {
	public void fold() throws Exception;
}

class Paper implements Foldable {
	public void fold() { // line 6
		System.out.print("Fold");
	}
}

