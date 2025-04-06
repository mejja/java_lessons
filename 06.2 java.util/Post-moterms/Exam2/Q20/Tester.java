import java.util.TreeMap;
public class Tester {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put (1, "one");
		map.put (2, "two");
		map.put (3, "three");
		map.put (4, "four");
		System.out.print(map.higherKey(2));
		System.out.print(map.ceilingKey(2));
		System.out.print(map.floorKey(1));
		System.out.print(map.lowerKey(1));
	}
}