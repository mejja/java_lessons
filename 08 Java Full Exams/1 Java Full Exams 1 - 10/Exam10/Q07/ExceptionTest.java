public class ExceptionTest{
	public static void main(String [] args) throws Exception{
		try{
			m2();
		}
		finally{ System.out.println("finally");}
		}
	public static void m2() throws NewException{ throw new NewException(); }
	public static void m3() throws AnotherException{ throw new AnotherException(); }
}

class NewException extends Exception {}
class AnotherException extends Exception {}