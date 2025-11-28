import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestArrayListAdd{
	public static void main(String[] args) {
		//Regular ArrayList
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);

		//Create a synchronized view of the list
		List<Integer> synchronizedList = Collections.synchronizedList(list);

		// Now you can safely access and modify the list from multiple threads
		synchronized (synchronizedList){
			for(Integer i : synchronizedList){
				System.out.println(i);
			}
		}
	}
}