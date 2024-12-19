import java.util.*;
public class TestClass{
	public static void main (String[] args) {
		Car cl = new Car ("Auto");
		Car c2 = new Car ("4m", 150, "Manual");
		System. out. println (cl. type + " "+ c1.maxSpeed + " "+ cl.trans) ;
		System. out. println(c2.type +" " +c2.maxspeed +" " + c2.trans) ;
	}
}
class Vehicle {
	String type = "4W";
	int maxSpeed = 100;

	Vehicle (String type, int maxSpeed) {
		this. type = type;
		this.maxSpeed = maxSpeed;
	}
}

class Car extends Vehicle {
	String trans;

	Car (String trans) { //line n1
		this.trans = trans;
	}

	Car (String type, int maxSpeed, String trans) {
		super (type, maxSpeed) ;
		this (trans) ;//line n2
	}
}

