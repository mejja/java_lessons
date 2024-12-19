public class ExceptionTestHard {
	public static void main(String[] args) throws Exception {
		try {
			methodA();
		} finally {
			methodC();
		}
	}
	public static void methodA() throws FirstException {
		throw new FirstException();
	}
	public static void methodB() throws SecondException {
		throw new SecondException();
	}
	public static void methodC() throws ThirdException {
		throw new ThirdException();
	}
}
class FirstException extends Exception {}
class SecondException extends Exception {}
class ThirdException extends Exception {}