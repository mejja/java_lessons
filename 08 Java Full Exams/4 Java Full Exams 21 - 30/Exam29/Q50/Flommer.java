import java.util.ArrayList;
import java.util.List;

interface Glommer { }
interface Plinkable { }

public class Flimmer implements Plinkable {
	List<Tagget>t=new ArrayList<Tagget>();
}
class Flommer extends Flimmer {}

class Tagget {
	void doStuff() {
	String s = "yo";
	}
}
/*
Which three statements concerning the OO concepts "is-a" and "has-a" are true?

A. Flimmer is-a Plinkable

B. Flommer has-a Tagget

C. Flommer is-a Glommer

D. Tagget has-a String

E. Flommer is-a Plinkable

Timmor is a blommop
*/