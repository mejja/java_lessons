import java.util.ArrayList;
import java.util.Collections;

public class ArrayJava {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();

		arrayList.add("1");
		arrayList.add("3");
		arrayList.add("5");
		arrayList.add("2");
		arrayList.add("4");

		Collections.sort(arrayList);

		System.out.println("ArrayList elements are : ");
		for(int i=0; i<arrayList.size(); i++)
		System.out.println(arrayList.get(i));
	}
}