public class MenuPrinter{
	public static void printMenu(){
		System.out.println("...SIMPLE CALCULATOR....");
		//System.out.println("...CHOOSE AN OPERATION...");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus");
	}
	public static void addResult(double op1, String operator, double op2, double result){
		System.out.println(op1 +" "+ operator +" "+ op2+ " = "+ result);
	}
	public static void subResult(double op1, String operator, double op2, double result){
		System.out.println(op1 +" "+ operator +" "+ op2+ " = "+ result);
	}
	public static void multResult(double op1, String operator, double op2, double result){
		System.out.println(op1 +" "+ operator +" "+ op2+ " = "+ result);
	}
	public static void divResult(double op1, String operator, double op2, double result){
		System.out.println(op1 +" "+ operator +" "+ op2+ " = "+ result);
	}
	public static void modResult(double op1, String operator, double op2, double result){
		System.out.println(op1 +" "+ operator +" "+ op2+ " = "+ result);
	}

}