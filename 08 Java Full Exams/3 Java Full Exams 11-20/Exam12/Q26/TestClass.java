//What can be inserted at //1 and //2 in the code below so that it can
//compile without errors:

public class TestClass {
	public static void main(String[] args) {
		Barbie b = new Barbie( "mydoll");
	}
}
class Doll{
	String name;
	Doll(String nm){
		this.name = nm;
	}
}
class Barbie extends Doll{
	Barbie(){
		//1
	}
	Barbie(String nm){
	//2
	}
}
