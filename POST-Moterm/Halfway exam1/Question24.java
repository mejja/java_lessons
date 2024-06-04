public class Question24{
	public static void main(String args[]){
	 boolean a =1 && 2;//1 and 2 are interger and not boolean operands
	 boolean b = true && false;//valid boolean expression
	 boolean c = 1 & 2;//invalid
	 boolean d = true & false;//valid but not short-circuit
	 boolean e = 1||2;//invalid
	}
}