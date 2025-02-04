public class Question36{
	public static void main(String[] args){
		String s = "";
		boolean b1 = true;
		boolean b2 = false;
		if((b2 = false) | (21%5) > 2) s += "X";//execute
		if(b1 || (b2 = true)) s += "y";//execute
		if(b2 == true) s += "z";//won't execute
		System.out.println(s);//print y
	}
}