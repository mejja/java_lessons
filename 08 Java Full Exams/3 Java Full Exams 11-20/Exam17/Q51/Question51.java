import java.util.ArrayList;

public class Question51 {
	public static void main(String[] args) {
		java.util. ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(1, 6);
		list.remove(0);
		for(Integer s : list) System.out.println(s);
	}
}