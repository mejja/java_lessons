import java.util.Vector;
import java.util.Collections;
import java.util.List;

public class TestVectorSet{
	public static void main(String[]  args){
		//Vector
		Vector<String> vector = new Vector<>();
		vector.add("MAJOR");
		vector.add("Kiema");
		vector.add("MBANDI");

		System.out.println("Vector before set:"+vector);
		vector.set(1, "JAVA");

		//After setting second element
		System.out.println("Vector After set:"+vector);
	}
}