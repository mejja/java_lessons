public class Tester{
	public static void main(String[] args) {
		StringWrapper sw = new StringWrapper("How are you?");
		StringBuilder sb = new StringBuilder("How are you?");
		System. out.println("Hello, "+sw);//Line 1
		System.out.println("Hello, "+sb);//Line 2
	}
}
class StringWrapper {
	private String theVal;
	public StringWrapper(String str){ 
		this.theVal = str; 
	}
}