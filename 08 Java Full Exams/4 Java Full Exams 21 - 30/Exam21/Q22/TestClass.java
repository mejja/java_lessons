//assume appropriate imports
public class TestClass {
	public static void main(String[] args) {
		try {
			PortConnector pc = new PortConnector(10);
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
	}
}
class PortConnector {
	public PortConnector(int port) {
		if (Math. random() > 0.5) {
			throw new IOException();
		}
			throw new RuntimeException();
	}
}
//What two changes can you do, independent of each other, to make the following code compile:
