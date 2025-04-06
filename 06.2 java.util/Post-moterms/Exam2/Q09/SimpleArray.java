import java.util.ArrayList;

public class SimpleArray{
	public static void main(String[] args) {

	ArrayList arrayList = new ArrayList();

	arrayList.add("1");
	arrayList.add("2");
	arrayList.add("3");

	arrayList.remove(1);

	System.out.println("Getting elements of ArrayList");
	System.out.println(arrayList.get(0));
	System.out.println(arrayList.get(1));
	System.out.println(arrayList.get(2));
	}
}