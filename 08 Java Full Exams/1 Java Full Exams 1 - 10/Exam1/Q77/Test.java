import java.util.*;
public class Test{
	static int i = 0;
	static Object prevObject;
	public static void main (String[] args) {
		saveObject(new ArrayList());
		
		Collection c = new ArrayList();
		saveObject(c);

		List I = new ArrayList();
		saveObject(null);

		saveObject(null);

		saveObject(0);

	}

	public static void saveObject(List e){
		prevObject = e;
		i++;
	}
}