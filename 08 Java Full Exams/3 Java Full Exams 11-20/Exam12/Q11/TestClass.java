public class TestClass{
	public static void main(String args[]){
		String s = "blooper";
		StringBuilder sb = new StringBuilder(s);
		sb. append(s. substring(4) ) . delete(3, 5);
		System. out. println(sb);
	}
}