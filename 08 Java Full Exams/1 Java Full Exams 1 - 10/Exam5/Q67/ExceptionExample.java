import java.io. FileNotFoundException;
import java.io.IOException;


public class ExceptionExample {
	public static void main(String[] args) {
		try {
			methodA();
		} catch (IOException e) {
			System.out.println("IOException caught: " + e.getMessage());
		} catch (CustomException e) {
			System.out.println("CustomException caught: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception caught: " + e.getMessage());
		} finally {
			System.out.println("Finally block executed");
		}
		try {
		methodB();
		} catch (RuntimeException | CustomException e) {
			System.out.println("Exception caught: "+ e.getClass().getSimpleName());
		}
}

	public static void methodA() throws IOException, CustomException {
		int random = (int) (Math.random() * 3);
		if (random == 0) {
			throw new FileNotFoundException("File not found");
		} else if (random == 1) {
			throw new CustomException("Custom exception occurred");
		}
		System.out.println("methodA completed successfully");
	}

	public static void methodB() throws CustomException {
		try {
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			throw new CustomException("Error in calculation");
		}
	}
}
class CustomException extends Exception {
	public CustomException(String message) {
		super (message) ;
	}
}