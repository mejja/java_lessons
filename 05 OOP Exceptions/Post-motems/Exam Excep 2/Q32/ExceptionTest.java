public class ExceptionTest {
	void myMethod() throws MyyException{
		throw new MyException3();
	}
	public static void main (String[] args){
		ExceptionTest et = new ExceptionTest();
		try{
			et.myMethod();
		}
		catch(MyException3 me3){
			System.out.println("MyException3 thrown");
		}
		catch(MyyException me){
			System.out.println("MyyException thrown");
		}
		finally{
			System.out.println("Done");
		}
	}
}

class MyyException extends Exception{}
class MyException3 extends MyyException{}