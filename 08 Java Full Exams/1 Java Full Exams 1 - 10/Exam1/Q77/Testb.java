import java.util.*;
public class Testb{
	static int i = 0;
	static Object prevObject;
	public static void main (String[] args) {
		saveObject(new ArrayList());
		
		List c = new ArrayList();
		saveObject(c);

		List I = new ArrayList();
		saveObject(null);

		saveObject(null);

		saveObject(I);

	}

	public static void saveObject(List e){
		prevObject = e;
		i++;
	}
}