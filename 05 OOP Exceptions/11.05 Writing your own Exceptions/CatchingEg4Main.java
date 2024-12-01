import com.MbandiException;

public class CatchingEg4Main {
	public static void main(String[] args) {
		try{
			CatchingEg4 myObject = new CatchingEg4();
			myObject.doSomething();
		}
		catch(MbandiException e){
			System.out.println("Caught exception: "+ e.getMessage());
		}
	}
}
