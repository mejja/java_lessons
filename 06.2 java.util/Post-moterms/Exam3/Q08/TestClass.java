import java.util.*;
public class TestClass{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		Iterator<Integer> itr = list.iterator();
		for(Integer wij:list){
			System.out.println("number: "+ wij);
		}
	}
}