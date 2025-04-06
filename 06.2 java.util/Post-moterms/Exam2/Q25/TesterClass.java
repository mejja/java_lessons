import java.util.ArrayList;
import java.util.Collections;

public class TesterClass {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();

		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("D");

		Collections.fill(arrayList,"REPLACED");

		System.out.println("ArrayList contains : " + arrayList);
	}
}