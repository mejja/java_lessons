import com.MbandiException;

public class CatchingEg4 {
	public void doSomething() throws MbandiException {
		int i = 42;
		
		if(i > 30){
			throw new MbandiException("Mbandi exception");
		}
		System.out.println("Doing something...");
	}
}
