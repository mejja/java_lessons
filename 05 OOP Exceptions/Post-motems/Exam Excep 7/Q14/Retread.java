public class Retread extends Tire {
	public static void main (String[] args) {
		new Retread().doStuff();
		}
		// insert code here
		void doStuff() throws ArithmeticException{
		System.out.println(7/0);
	}
}
class MyException extends Exception { }
class Tire {
	void doStuff() { }
}

//I. void doStuff(){
//II. void doStuff() throws MyException{
//III. void doStuff() throws RuntimeException{
//IV. void doStuff() throws ArthmeticException{

// when fragement I-IV are added, independetly, at line 5, which are true(Choose all that apply)

