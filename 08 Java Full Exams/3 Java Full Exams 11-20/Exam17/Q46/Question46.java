import java.util .*;
import java.util.ArrayList;

public class Question46 {
	public static void main(String[] args) {

		java.util.ArrayList arrayList = new ArrayList();
		for (int i = 0; i < arrayList.size() ; i++)
		System.out.println(arrayList.get(i));

		arrayList.add("1");
		arrayList.add("3");
		arrayList.add("9");
		arrayList.add("2");
		arrayList.add("4");

		Collections.sort(arrayList);
	}
}