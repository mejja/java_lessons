import java.util.ArrayList;

public class ArraylistExample {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.removeAll(arrayList);

		System.out.println(+ arrayList.size());
		}
}