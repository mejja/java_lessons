import java.util.ArrayList;

public class Question50 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(5);
		list.set(2,7);
		list.add( 1, 6);
		list.remove( 0);
		for(Integer s : list) System.out.println(s);
	}
}