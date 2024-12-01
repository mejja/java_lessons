import java.io.IOException; //line 1

public class Tester { // 8
	public static void main(String args[]) throws IOException { // line 10
		new AirPlane(); // line 11
	} // line 12
} // line 13


class AirPlane { // 2
	public AirPlane() throws IOException, RuntimeException { //3
		System.out.println("AirPlane"); //4
	} //5
} //6

class AirJet extends AirPlane { } // line 7
