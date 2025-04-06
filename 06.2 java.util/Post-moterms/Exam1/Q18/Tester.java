import java.util.ArrayList;
import java.util. Collections;
import java.util.List;

public class Tester{
	public static void main(String[] args) {
		List<Human> humans = new ArrayList<Human>();
		humans .add (new Human(13)) ;
		humans.add(new Human(33)) ;
		humans . add (new Human(21)) ;
		humans. add (new Human(21)) ;
		Collections.sort (humans);
		System.out.print(humans.get(0).age);
		System.out.print(humans.size());
	}
}
	class Human implements Comparable<Human> {
	int age;
	public Human(int age) {
	this.age = age;
	}
	public int compareTo(Human h) {
	return h.age.compareTo(this.age);
	}
}