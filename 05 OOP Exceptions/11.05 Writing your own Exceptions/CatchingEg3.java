import com.MajorException;

public class CatchingEg3 {
	public void doSomething() throws MajorException {
		int i = 42;
		
		if(i > 30){
			throw new MajorException("Major exception");
		}
		System.out.println("Doing something...");
	}
}
