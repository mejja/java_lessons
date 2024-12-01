import java.io.IOException;

public class Tester {
	public static void main(String args[]) {
		try {
		new AirJet();
		} catch (IOException e) {
			System.out.print("IOException is thrown in Tester");
		}
	}
}

class AirPlane {
	public AirPlane() {
		System.out.print("AirPlane");
	}
}

class AirJet extends AirPlane {
	public AirJet() throws IOException {
		try {
		throw new IOException();
		} catch (IOException e) {
			System.out.print("IOException is thrown in AirJet");
		}
	}
}

