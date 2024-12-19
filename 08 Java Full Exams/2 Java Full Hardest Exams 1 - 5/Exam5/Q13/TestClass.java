public class TestClass{
	static int x;
	public static int getSwitch(String str){
		x=(int) Math.round( Double.parseDouble(str.substring(1, str.length()-1)) );
		return x;
	}
	public static void main(String args []){
		switch(getSwitch(args[0])){
			case 0 : {
				System.out.println(x);
				System.out.print("Hello ");
			}
			case 1 : System.out.print("World"); break;
			default : System.out.print ("Good Bye");
		}
	}
}