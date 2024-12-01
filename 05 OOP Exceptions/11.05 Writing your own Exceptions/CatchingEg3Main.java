import com.MajorException;

public class CatchingEg3Main {
	public static void main(String[] args) {
		try{
			CatchingEg3 myObject = new CatchingEg3();
			myObject.doSomething();
		}
		catch(MajorException e){
			System.out.println("Caught exception: "+ e.getMessage());
		}
	}
}
