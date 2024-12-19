public class Driver {
	public static void main(String [ ] args) {
		Transport [ ] autos = { new Transport(), new Bullock() };
		for (int x = 0; x < autos.length; x++)
		autos[x].drive();
	}
}
class Transport {
	public void drive() { System.out.print("go forward "); }
}
class Bullock extends Transport {
	public void drive () { System.out.print("go fast "); }
}