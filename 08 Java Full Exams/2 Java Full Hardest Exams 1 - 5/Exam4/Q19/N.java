class M { }
class N{
	private M m = new M() ;
	public void makeItNull (M pM) {
		pM = null;
	}
	public void makeThisNull() {
		makeItNull (m) ;
	}
	public static void main(String[] args) {
		N n = new N() ;
		n.makeThisNull() ;
	}
}


//Which of the following statements are correct?

//A. There are no instances of M to be garbage collected till the program ends.

//B. A call to n.makeThisNull() marks the private instance of M for garbage collection.

//C. Setting pM = null; in makeltNull(), marks the private instance of M for garbage collection.

//D. private members of a class become eligible for garbage collection only when the
//instance of the class itself becomes eligible for garbage collection.

