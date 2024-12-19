public class Shuttle extends Rocket {
	public static void main(String [] args) {
		new Shuttle().go();
	}

	void go() {
		blastOff();
		// Rocket.blastOff(); // line A
	}

	private void blastOff() {
		System.out.print("sh-bang ");
	}
}
class Rocket{
	private void blastoff() {
		System.out.print("bang ");
	}
}