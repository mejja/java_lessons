import java.util.HashSet;
import java.util.Collections;

public class TesterClass {
	public static void main(String[] args) {
	HashSet hashSet = new HashSet();
	hashSet.add(new Long("923740927"));
	hashSet.add(new Long("4298748382"));
	hashSet.add(new Long("2374324832"));
	hashSet.add(new Long("2473483643"));
	hashSet.add(new Long("32987432984"));

	Object obj = Collections.min(hashSet);

	System.out.println("Min Element of Java HashSet is : " + obj);
	}
}