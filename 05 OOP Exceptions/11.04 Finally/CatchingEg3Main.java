//imports
import com.CatchingEg3;

public class CatchingEg3Main {
	static CatchingEg3 catchingEg3;
	public static void main(String[] args) throws Exception{
		try{
			CatchingEg3 myObject = new CatchingEg3();
			myObject.doSomething();
		}
		finally{
			System.out.println("Finished");	
		}
	}
}
