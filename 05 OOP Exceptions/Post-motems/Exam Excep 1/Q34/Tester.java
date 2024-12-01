public class Tester {
	public static void main (String[] args) {
		System.out.print (new Sub() instanceof Super); //line 1
		System. out. print (new Sub() instanceof Bouncable);//line 2
		System. out.print(new Sub() instanceof Colorable);//line 3
		System.out.print(new Super() instanceof Sub);//line 4
		System. out. print(new Super() instanceof Colorable);//line 5
	}
}

interface Colorable { }
interface Bouncable extends Colorable { }
class Super implements Bouncable { }
class Sub extends Super implements Bouncable { }
