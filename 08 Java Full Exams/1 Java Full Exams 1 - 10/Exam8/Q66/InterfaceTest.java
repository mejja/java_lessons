public class InterfaceTest {
	public static void main(String[] args) {
		Playable p = new Instrument();
		p.play();
	}
}
interface Playable {
	default void play() {
		System.out.println("Playing");
	}
}
interface Musical extends Playable {
	void compose();
	default void play() {
		System.out.println("Playing music");
	}
}
class Instrument implements Musical {
	public void compose() {
		System.out.println("Composing");
	}
}

